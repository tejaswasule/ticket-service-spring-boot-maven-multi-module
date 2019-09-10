package com.test.io.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({ "com.test" })

@EntityScan("com.test.io.entity")

@EnableJpaRepositories("com.test.io.repository")

public class RestConfig {

	public static void main(String args[]) {
		SpringApplication.run(RestConfig.class, args);
	}
}
