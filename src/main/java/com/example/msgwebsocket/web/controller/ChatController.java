package com.example.msgwebsocket.web.controller;

import com.example.msgwebsocket.persistance.data.*;
import org.springframework.messaging.handler.annotation.*;
import org.springframework.stereotype.*;

@Controller
public class ChatController {
    @MessageMapping("send-msg-at")
    @SendTo("/topic/receive-msg-at")
    public ChatDTO chatWithUssers(ChatDTO chatDto){
        return chatDto;
    }
}
