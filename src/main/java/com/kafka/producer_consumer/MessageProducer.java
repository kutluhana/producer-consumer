package com.kafka.producer_consumer;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void send(MessageRequest messageRequest) {
        kafkaTemplate.send("match-score", messageRequest.key, messageRequest.data);
    }

}
