package com.example.demo.example.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.example.Example;
import com.example.demo.service.SomeService;

//@Component
public class FieldInjectionExample implements Example {

	@Autowired
	private SomeService someService;

	@Override
	public void run() {
		someService.doService();
	}
}
