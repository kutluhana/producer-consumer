package com.kafka.producer_consumer;

import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class MessageConsumer {

    @KafkaListener(topics = "match-score", groupId = "match-score-consumer")
    public void consumeSerbia(ConsumerRecord<String, String> payload) {
        if(payload.key().equals("serbia-turkey")) {
            System.out.println(payload.key());
            System.out.println(payload.value() + " haydi çocuklar");
        } else if(payload.key().equals("usa-brazil")) {
            System.out.println(payload.key());
            System.out.println(payload.value());
        }
    }

}
