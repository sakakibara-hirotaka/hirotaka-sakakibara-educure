package jp.educure.problem4.meetingroom;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

public class MeetingRoomVilidator implements Validator{

    @Override
    public boolean supports(Class<?> clazz) {
        return MeetingRoomForm.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        MeetingRoomForm form = (MeetingRoomForm) target;

        if(form.getRoomName() == null || form.getRoomName().isEmpty()) {
            errors.rejectValue("roomName", "required", "会議室名は必須です");
        }

        DayOfWeek day = form.getStartDateTime().getDayOfWeek();
        LocalTime startTime = form.getStartDateTime().toLocalTime();
        LocalTime endTime = form.getEndDateTime().toLocalTime();
        LocalTime openTime = LocalTime.of(9, 0);
        LocalTime closeTime = LocalTime.of(18, 0);
        if(day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY ||
            (startTime.isBefore(openTime)) || (endTime.isAfter(closeTime))) {
                errors.rejectValue("startDateTime", "outOfHours" , "平日9:00～18:00の間で予約してください");
        }

        Duration duration = Duration.between(startTime, endTime);
        long minutes = duration.toMinutes();
        if(minutes > 180) {
            errors.rejectValue("startDateTime", "tooLong", "最大利用時間は3時間までです。");
        }

        if(form.getPeopleCount() >= 10 && form.getRoomName().equals("小会議室")) {
            errors.rejectValue("peopleCount", "roomMismatch", "10人以上の場合は大会議室を選択してください");
        }

        if(form.getPeopleCount() <= 9 && form.getRoomName().equals("大会議室")) {
            errors.rejectValue("peopleCount", "roomMismatch", "9人以下の場合は小会議室を選択してください");
        }

        if(form.getPeopleCount() <= 0 || form.getPeopleCount() >= 20) {
            errors.rejectValue("peopleCount", "peopleMismatch", "利用人数は1～20人の間で入力してください");
        }
    }
}