package com.financial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = "com.financial.config")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}