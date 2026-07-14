package jp.educure.problem1.messagesender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    private final MessageSender emailSender;

    @Autowired                  
    public NotificationService(MessageSender emailSender) {
        this.emailSender = emailSender;
    }

    public void sendNotification(String message) {
        emailSender.sendEmail(message);
    }
}
