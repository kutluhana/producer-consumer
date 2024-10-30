package com.kafka.producer_consumer;

import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MessageConsumer {

    @KafkaListener(topics = "match-score", containerFactory = "kafkaListenerContainerFactory")
    public void consumeUsaBrazil(ConsumerRecord<String, String> payload) {

        System.out.println("Consumer 999999999 received: " + payload.value());

    }

    @KafkaListener(topics = "match-score", containerFactory = "kafkaListenerContainerFactory")
    public void consumeSerbiaTurkey(ConsumerRecord<String, String> payload) {

        System.out.println("Consumer 00 received: " + payload.value());

    }

}
