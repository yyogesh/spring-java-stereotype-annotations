package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("notify1")
public class Notification {
    @Value("testing")
    private String name;
    private int id;
        //    @Qualifier("emailNotification")
    Message message;

    public Notification() {
        System.out.println("Notification object crated");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Message getMessage() {
        return message;
    }

    @Autowired
    public void setMessage(Message message) {
        this.message = message;
    }

    public void sendNotification() {
        message.sendMessage();
        // System.out.println("Send notification method called..");
    }
}
