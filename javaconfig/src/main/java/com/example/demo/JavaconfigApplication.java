package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.servise.BusinessLogic;

@SpringBootApplication
public class JavaconfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaconfigApplication.class, args)
		.getBean(JavaconfigApplication.class).exe();
	}

	@Autowired
	@Qualifier("test")
	private BusinessLogic business1;

	@Autowired
	@Qualifier("sample")
	private BusinessLogic business2;

	public void exe() {
		business1.doLogic();
		business2.doLogic();
	}
}
