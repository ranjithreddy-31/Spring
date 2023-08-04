package com.example.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(FirstApplication.class, args);
		Alien a = context.getBean(Alien.class);
		a.show();
		System.out.println("Welcome to boot");
	}

}
