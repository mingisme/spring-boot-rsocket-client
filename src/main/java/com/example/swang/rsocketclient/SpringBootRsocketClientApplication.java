package com.example.swang.rsocketclient;

import lombok.SneakyThrows;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.rsocket.RSocketRequester;
import org.springframework.messaging.rsocket.RSocketStrategies;

@SpringBootApplication
public class SpringBootRsocketClientApplication {

	@SneakyThrows
	public static void main(String[] args) {
		SpringApplication.run(SpringBootRsocketClientApplication.class, args);
	}

}
