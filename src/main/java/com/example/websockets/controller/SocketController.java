package com.example.websockets.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.example.websockkets.model.Message;

@Controller
public class SocketController {
	@MessageMapping("/chat")
	@SendTo("/topic/messages")
	public String send(Message message) throws Exception {
	    return message.getFrom() + message.getText();
	}
}
