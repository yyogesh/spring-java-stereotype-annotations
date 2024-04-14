package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
// @Scope("prototype")
public class SmsNotification implements Message{
    @Override
    public void sendMessage() {
        System.out.println("SMS Message send...");
    }
}

