package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com")
@EntityScan(basePackages = {"com.cg.model"})
@SpringBootApplication
public class TraineeManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(TraineeManagementApplication.class, args);
	}

}
