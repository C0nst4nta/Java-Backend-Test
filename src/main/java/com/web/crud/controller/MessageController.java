package com.web.crud.controller;

import com.web.crud.service.RedisMessagePublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    private final RedisMessagePublisher redisMessagePublisher;

    public MessageController(RedisMessagePublisher redisMessagePublisher) {
        this.redisMessagePublisher = redisMessagePublisher;
    }

    // Endpoint to publish a message
    @GetMapping("/publish")
    public String publishMessage(@RequestParam String message) {
        redisMessagePublisher.publish(message);
        return "Message published!";
    }
}
