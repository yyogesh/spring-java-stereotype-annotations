package org.example;

import org.springframework.stereotype.Component;

@Component
public class EmailNotification implements Message{
    @Override
    public void sendMessage() {
        System.out.println("Email Message send...");
    }
}
