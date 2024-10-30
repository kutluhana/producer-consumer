package com.kafka.producer_consumer;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MessageProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public void send(List<MessageRequest> messageRequest) {
        messageRequest.forEach(item -> kafkaTemplate.send("match-score", item.data));
    }

}
