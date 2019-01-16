package oktenweb.controllers;

import oktenweb.models.Answer;
import oktenweb.models.IncomingMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    // this method should not exist, though index does not appear without this method
    @GetMapping("/")
    public String home(){
        return "index";
    }

    @MessageMapping("/roomName")
    @SendTo("/chanelName/answer")
    public Answer answer(IncomingMessage incomingMessage){

        System.out.println(incomingMessage);
        //return "Answer fom the method in Controller";
        return new Answer("Answer fom the method in Controller");
    }
}
