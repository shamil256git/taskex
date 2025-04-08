package com.example.di;

public class MainApp {
    public static void main(String[] args) {
        TaskService emailService = new EmailTaskService("smtp.gmail.com");
        TaskProcessor processor1 = new TaskProcessor(emailService);
        processor1.process();

        TaskService smsService = new SmsTaskService("Twilio");
        TaskProcessor processor2 = new TaskProcessor(smsService);
        processor2.process();
    }
}

