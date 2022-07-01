package com.estudo.redis.controller;

import com.estudo.redis.configuration.RedisMessagePublisher;
import com.estudo.redis.configuration.RedisMessageSubscriber;
import com.estudo.redis.model.Message;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("Redis")
@RequestMapping("/api/redis")
public class RedisController {
    private static Logger logger = LoggerFactory.getLogger(RestController.class);
    @Autowired
    private RedisMessagePublisher redisMessagePublisher;

    @PostMapping("/publish")
    public void publish(@RequestBody Message message) {
        logger.info(">> publishing : {}", message);
        redisMessagePublisher.publish(message.toString());
    }

    @GetMapping("/subscribe")
    public List<String> getMessages() {
        return RedisMessageSubscriber.messageList;
    }
}
