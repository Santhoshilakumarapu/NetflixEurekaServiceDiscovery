package net.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TechefxNetflixEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechefxNetflixEurekaApplication.class, args);
	}

}
