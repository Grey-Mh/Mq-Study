package com.mhl.consumer;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Listener {
    @RabbitListener(queues = "simpleQueue")
    public void listenQueue(String msg){
        System.out.println("消费者收到: " + msg);
    }
}
