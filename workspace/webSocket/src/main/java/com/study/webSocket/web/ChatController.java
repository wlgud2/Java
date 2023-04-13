package com.study.webSocket.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ChatController {

	@GetMapping("/chat")
	public String get() {
		log.info("컨트롤러 동작!!!");
		return "chat sample";
	}
}
