package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.TargetService;

@SpringBootApplication
public class AopApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopApplication.class, args)
		.getBean(AopApplication.class).exe();
	}

	@Autowired
	private TargetService service;

	private void exe() {
		service.sayHello("taro");
		System.out.println("-");
		service.sayGoodbye("hanako");
	}
}
