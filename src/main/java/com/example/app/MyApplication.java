package com.example.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(MyApplication.class, args);
	}
}
