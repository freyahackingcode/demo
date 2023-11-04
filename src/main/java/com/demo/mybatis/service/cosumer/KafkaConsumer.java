package com.demo.mybatis.service.cosumer;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    @KafkaListener(topics = "gooddata")
    public void processMessage(ConsumerRecord<Integer, String> record) {

        log.info("kafka receive data topic:"+record.topic()+", data:"+record.value());
    }
}
