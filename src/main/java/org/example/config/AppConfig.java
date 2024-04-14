package org.example.config;

import org.example.EmailNotification;
import org.example.Message;
import org.example.Notification;
import org.example.SmsNotification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.example")
public class AppConfig {
//    @Bean(name = {"notify", "notify1"})
//    // @Scope("prototype")
//    //public Notification notification12(@Autowired  Message message) {
//    // public Notification notification12(@Qualifier("emailNotification") Message message) {
//    public Notification notification12(Message message) {
//        Notification obj = new Notification();
//        obj.setName("Testing");
//        obj.setMessage(message);
//        return obj;
//    }
//
////    @Bean(name = {"notify", "notify1"})
////    // @Scope("prototype")
////    public Notification notification12() {
////        Notification obj = new Notification();
////        obj.setName("Testing");
////        obj.setMessage(emailNotification());
////        return obj;
////    }
//
//    @Bean
//    public EmailNotification emailNotification() {
//        return new EmailNotification();
//    }
//
//    @Bean
//    @Primary
//    public SmsNotification smsNotification() {
//        return new SmsNotification();
//    }
}
