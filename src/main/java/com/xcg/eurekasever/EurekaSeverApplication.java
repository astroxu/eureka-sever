package com.xcg.eurekasever;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaSeverApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaSeverApplication.class, args);
		//new SpringApplicationBuilder(EurekaSeverApplication.class).web(true).run(args);
	}
}
