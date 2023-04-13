package com.study.webSocket;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class WebSocketApplicationTests {

	@Test
	void contextLoads() {
		String version=org.springframework.core.SpringVersion.getVersion();
		System.out.println("version: "+version);
	}

}
