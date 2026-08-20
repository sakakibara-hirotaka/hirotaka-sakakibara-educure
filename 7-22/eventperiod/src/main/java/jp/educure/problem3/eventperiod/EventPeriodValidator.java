package jp.educure.problem3.eventperiod;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

@Component
public class EventPeriodValidator implements ConstraintValidator<ValidEventPeriod, EventPeriodForm>{

    
    @Override
    public boolean isValid(EventPeriodForm form, ConstraintValidatorContext context)  {

        if(form.getStartDateTime() == null || form.getEndDateTime() == null) {
            return true;
        }

        boolean valid = true;
        context.disableDefaultConstraintViolation();

        if(form.getStartDateTime().isAfter(form.getEndDateTime())
            || form.getStartDateTime().equals(form.getEndDateTime())) {
            context.buildConstraintViolationWithTemplate("終了日は開始日より後の日付でなければなりません")
                    .addPropertyNode("endDateTime")
                    .addConstraintViolation();
            valid = false;

        }

        if(form.getStartDateTime().isBefore(LocalDate.now())) {
            context.buildConstraintViolationWithTemplate("開始日は本日以降の日付でなければなりません")
                    .addPropertyNode("startDateTime")
                    .addConstraintViolation();
            valid = false;
        }
        return valid;

    }
}

