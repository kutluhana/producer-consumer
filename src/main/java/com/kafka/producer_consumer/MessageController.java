package com.kafka.producer_consumer;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Stream;

@RestController
@RequestMapping("/message")
public class MessageController {

    private final MessageProducer messageProducer;

    public MessageController(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    @GetMapping
    public void message(@RequestBody List<MessageRequest> messageRequest) {
        Stream.of(messageRequest).forEach(messageProducer::send);
    }
}
