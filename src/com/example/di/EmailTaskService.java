package com.example.di;

public class EmailTaskService implements TaskService {
    private String smtpServer;

    public EmailTaskService(String smtpServer) {
        this.smtpServer = smtpServer;
    }

    @Override
    public void performTask() {
        System.out.println("Sending Email using SMTP server: " + smtpServer);
    }
}
