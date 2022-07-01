package com.estudo.redis.configuration;

public interface MessagePublisher {
    void publish(String message);
}
