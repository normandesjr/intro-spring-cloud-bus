package com.hibicode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CloudConfigServerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigServerExampleApplication.class, args);
	}
}
