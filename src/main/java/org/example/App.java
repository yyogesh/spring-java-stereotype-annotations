package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Notification notification = context.getBean("notify1", Notification.class);
        notification.sendNotification();
       // notification.setName("Test");
        System.out.println(notification.getName());

//        Notification notification1 = context.getBean("notify1", Notification.class);
//        notification1.sendNotification();
//        System.out.println(notification1.getName());

//        EmailNotification emailNotification = context.getBean(EmailNotification.class);
//        emailNotification.sendMessage();
    }
}
