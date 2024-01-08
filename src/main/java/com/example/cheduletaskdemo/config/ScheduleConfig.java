package com.example.cheduletaskdemo.config;

import com.example.cheduletaskdemo.task.MailRunnable;
import com.example.cheduletaskdemo.task.TaskCustom;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@Configuration
@EnableScheduling
@Slf4j
public class ScheduleConfig {

    @Autowired
    private MailRunnable mailRunnable;

    @Scheduled(cron = "* * * ? * *")
    public void sendMail() {
        TaskCustom sendMail = new TaskCustom(() -> mailRunnable.send());
        sendMail.run();
    }
}
