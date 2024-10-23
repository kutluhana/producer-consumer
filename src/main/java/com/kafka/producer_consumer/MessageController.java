package com.kafka.producer_consumer;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/message")
public class MessageController {

    private final MessageProducer messageProducer;

    public MessageController(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    @GetMapping
    public void message(@RequestBody MessageRequest messageRequest) {
        messageProducer.send(messageRequest);
    }
}
