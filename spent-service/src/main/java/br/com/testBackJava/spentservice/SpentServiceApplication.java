package br.com.testBackJava.spentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpentServiceApplication.class, args);
	}

}
