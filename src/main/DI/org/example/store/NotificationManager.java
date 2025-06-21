package org.example.store;

import org.springframework.stereotype.Component;

@Component
public class NotificationManager {

    private final NotificationService notificationService;

    public NotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendNotification(String message, String recipientEmail){

        notificationService.send(message, recipientEmail);
    }

}
