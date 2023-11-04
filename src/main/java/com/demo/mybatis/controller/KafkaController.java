package com.demo.mybatis.controller;

import com.demo.mybatis.pojo.User;
import com.demo.mybatis.service.producer.KafkaProducer;
import org.springframework.web.bind.annotation.*;
import com.alibaba.fastjson.JSONObject;

@RestController
public class KafkaController {
    private final KafkaProducer producerService;

    public KafkaController(KafkaProducer producerService) {
        this.producerService = producerService;
    }

    @PostMapping("/send")
    public void sendMessage(User user) {
        producerService.sendMessage(JSONObject.toJSONString(user));
    }
}
