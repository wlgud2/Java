package com.study.webSocket.web;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import com.study.webSocket.stomp.Greeting;
import com.study.webSocket.stomp.HelloMessage;

@Controller
public class StompController {
	@MessageMapping("/hello")
	@SendTo("/stomp/greeting")
	public Greeting greeting(HelloMessage message) throws Exception {
		Thread.sleep(1000);
		return new Greeting("hello" + HtmlUtils.htmlEscape(message.getName()));
	}
}
