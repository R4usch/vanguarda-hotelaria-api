package com.vanguarda.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.vanguarda.controller", "com.vanguarda.service", "com.vanguarda.repository" })
@EnableJpaRepositories(basePackages = "com.vanguarda.repository")
@EntityScan(basePackages = "com.vanguarda.entity")
public class HotelariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelariaApplication.class, args);
	}

}
