package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.used.Greet;

@SpringBootApplication
public class DiApplication {
	public static void main(String[] args) {
		SpringApplication.run(DiApplication.class, args)
		.getBean(DiApplication.class).execute();
	}
	
	@Autowired
	private Greet g;
	
	private void execute() {
		String msg = g.greeting();
		System.out.println(msg);
	}
}
