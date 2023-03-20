package my.frst.rabbitmq.dummieproject.controller;

import my.frst.rabbitmq.dummieproject.publisher.SinglePublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/local/messages")
public class RestService {

    @Autowired
    private SinglePublisher singlePublisher;

    @GetMapping("/{textMessage}")
    public String giveMeTheMessage(@PathVariable("textMessage") String message){
        this.singlePublisher.sendMessage(message);
        return "Message sent :D";
    }
}
