package my.frst.rabbitmq.dummieproject.publisher;

import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class PublisherConfiguration {

    @Value("${messaging.queue.name}")
    private String queueName;

    @Bean
    public Queue publishQueue(){
        return new Queue(queueName, Boolean.TRUE);
    }
}
