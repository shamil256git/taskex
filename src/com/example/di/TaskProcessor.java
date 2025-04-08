package com.example.di;

public class TaskProcessor {
    private TaskService taskService;

    public TaskProcessor(TaskService taskService) {
        this.taskService = taskService;
    }

    public void process() {
        taskService.performTask();
    }
}
