package my.frst.rabbitmq.dummieproject.consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SingleConsumer {

    @RabbitListener(queues = { "${messaging.queue.name}" })
    public void getMessage(@Payload String message){
        log.info("Llega mensaje: {}", message);
    }
}
