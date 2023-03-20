package my.frst.rabbitmq.dummieproject.publisher;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@EnableRabbit
@Slf4j
public class SinglePublisher {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue defaultQueue;

    public void sendMessage(Object messageWithAnythingInside){
        rabbitTemplate.convertAndSend(defaultQueue.getName(), messageWithAnythingInside);
        log.info("Message sent by rest-client, message: {}", messageWithAnythingInside);
    }
}
