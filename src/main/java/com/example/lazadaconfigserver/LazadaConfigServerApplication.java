package com.example.lazadaconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class LazadaConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LazadaConfigServerApplication.class, args);
	}

}
