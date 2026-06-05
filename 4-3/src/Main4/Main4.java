package Main4;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.ZoneId;

public class Main4 {
    private String eventName;
    private ZonedDateTime startTime;
    private ZonedDateTime endTime;

    public Main4(String name, ZonedDateTime start, ZonedDateTime end) {
        this.eventName = name;
        this.startTime = start;
        this.endTime = end;
    }

    public String getEventDuration() {
        Duration duration = Duration.between(startTime, endTime);
        long days = duration.toDays();
        long hours = duration.toHours() % 24;
        return days + "日と" + hours + "時間";
    }

    public String getLocalTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日 HH:mm z");
        return startTime.format(formatter);
    }

    public String getUtcTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日 HH:mm z");
        return startTime.withZoneSameInstant(ZoneId.of("UTC")).format(formatter);
    }


    public static void main(String[] args) {

        Main4 event = new Main4("サマーフェスティバル", ZonedDateTime.of(2024, 7, 1, 10, 00, 0, 0, ZoneId.of("Asia/Tokyo")), ZonedDateTime.of(2024,7,15,22,0,0,0,ZoneId.of("Asia/Tokyo")));
        //Main4 event = new Main4("ウィークリーイベント", ZonedDateTime.of(2024, 6, 1, 0, 00, 0, 0, ZoneId.of("Asia/Tokyo")), ZonedDateTime.of(2024,6,8,0,0,0,0,ZoneId.of("Asia/Tokyo")));
        //Main4 event = new Main4("マンスリーキャンペーン", ZonedDateTime.of(2024, 4, 1, 12, 00, 0, 0, ZoneId.of("Asia/Tokyo")), ZonedDateTime.of(2024,5,1,12,0,0,0,ZoneId.of("Asia/Tokyo")));
        //Main4 event = new Main4("ランチタイムセール", ZonedDateTime.of(2024, 8, 10, 11, 30, 0, 0, ZoneId.of("Asia/Tokyo")), ZonedDateTime.of(2024,8,10,14,30,0,0,ZoneId.of("Asia/Tokyo")));
        //Main4 event = new Main4("モーニングイベント", ZonedDateTime.of(2024, 9, 5, 8, 00, 0, 0, ZoneId.of("Asia/Tokyo")), ZonedDateTime.of(2024,9,5,10,0,0,0,ZoneId.of("Asia/Tokyo")));
        //Main4 event = new Main4("ミッドナイトセール", ZonedDateTime.of(2024, 10, 31, 23, 00, 0, 0, ZoneId.of("Asia/Tokyo")), ZonedDateTime.of(2024,11,1,2,0,0,0,ZoneId.of("Asia/Tokyo")));


    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日 HH:mm z");

        System.out.println("イベント: " + event.eventName);
        System.out.println("開始: " + event.startTime.format(formatter));
        System.out.println("終了: " + event.endTime.format(formatter));
        System.out.println("期間: " + event.getEventDuration());
        System.out.println("現地時間: " + event.getLocalTime());
        System.out.println("UTC時間: " + event.getUtcTime());
    }
}