package com.example.di;

public class SmsTaskService implements TaskService {
    private String provider;

    public SmsTaskService(String provider) {
        this.provider = provider;
    }

    @Override
    public void performTask() {
        System.out.println("Sending SMS using provider: " + provider);
    }
}

