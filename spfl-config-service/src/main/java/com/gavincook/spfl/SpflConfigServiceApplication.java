package com.gavincook.spfl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpflConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpflConfigServiceApplication.class, args);
	}

}
