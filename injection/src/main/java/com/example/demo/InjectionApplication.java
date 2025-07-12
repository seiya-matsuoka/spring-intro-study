package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.example.Example;

@SpringBootApplication
public class InjectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(InjectionApplication.class, args)
		.getBean(InjectionApplication.class).exe();
	}

	@Autowired
	private Example example;

	private void exe() {
		example.run();
	}
}
