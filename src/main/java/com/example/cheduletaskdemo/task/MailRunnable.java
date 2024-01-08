package com.example.cheduletaskdemo.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class MailRunnable {
    public void send() {
        log.info("Send mail successfully");
    }
}
