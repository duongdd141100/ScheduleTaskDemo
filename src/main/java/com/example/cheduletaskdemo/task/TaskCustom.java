package com.example.cheduletaskdemo.task;

import org.springframework.scheduling.config.Task;

public class TaskCustom extends Task {
    public TaskCustom(Runnable runnable) {
        super(runnable);
    }

    public void run() {
        notifyBefore();
        this.getRunnable().run();
        notifyAfter();
    }

    public void notifyBefore() {
        System.out.println("Start run");
    }

    public void notifyAfter() {
        System.out.println("Finish run");
    }
}
