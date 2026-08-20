package jp.educure.problem3.eventperiod;

import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;

@ValidEventPeriod
public class EventPeriodForm {
    
    @NotNull(message = "開始日を入力してください")
    private LocalDate startDateTime;

    @NotNull(message = "終了日を入力してください")
    private LocalDate endDateTime;

    public LocalDate getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDate startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDate getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDate endDateTime) {
        this.endDateTime = endDateTime;
    }
}
