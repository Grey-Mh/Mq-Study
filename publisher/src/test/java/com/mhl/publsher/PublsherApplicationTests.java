package com.mhl.publsher;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PublsherApplicationTests {
    @Autowired
    private RabbitTemplate template;

    @Test
    public void testSend(){
        //队列名
        String queueName = "simpleQueue";
        //消息内容
        String msg = "EMT";
        //发送
        template.convertAndSend(queueName,msg);
    }

}
