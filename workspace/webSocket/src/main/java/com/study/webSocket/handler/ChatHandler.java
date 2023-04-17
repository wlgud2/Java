package com.study.webSocket.handler;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ChatHandler extends TextWebSocketHandler {

	private static List<WebSocketSession> list = new ArrayList<>();

	@Override
	protected void handleTextMessage(WebSocketSession session, TextMessage message) {
		log.info("message: {}", message);
		String payload = message.getPayload();
		log.info("payload: {}", payload);
		for (WebSocketSession sess : list) {
			try {
				sess.sendMessage(message);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// 클라이언트 접속 시 호출되는 메서드
	@Override
	public void afterConnectionEstablished(WebSocketSession session) {
		list.add(session);
		log.info(session + " 클라이언트 접속");
	}

	// 접속 종료 시 호출되는 메서드
	@Override
	public void afterConnectionClosed(WebSocketSession session, CloseStatus status) {
		log.info(session + " 클라이언트 접속 해제");
		list.remove(session);
	}
}
