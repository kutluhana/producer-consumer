package com.kafka.producer_consumer;

import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.TopicPartition;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageConsumer {

    @KafkaListener(topics = "match-score", groupId = "match-score-consumer")
    public void consume(ConsumerRecord<String, String> payload) {
        System.out.println(payload.value());
        System.out.println(payload.key());
    }

}
