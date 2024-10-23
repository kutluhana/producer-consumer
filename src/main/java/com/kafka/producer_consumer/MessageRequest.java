package com.kafka.producer_consumer;

public class MessageRequest {

    String key;
    String data;

    public MessageRequest(String key, String data) {
        this.data = data;
        this.key = key;
    }
}
