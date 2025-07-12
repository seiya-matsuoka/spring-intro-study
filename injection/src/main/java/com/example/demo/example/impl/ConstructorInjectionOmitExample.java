package com.example.demo.example.impl;

import com.example.demo.example.Example;
import com.example.demo.service.SomeService;

//@Component
public class ConstructorInjectionOmitExample implements Example {

	private final SomeService someService;

	public ConstructorInjectionOmitExample(SomeService someService) {
		this.someService = someService;
	}

	@Override
	public void run() {
		someService.doService();
	}
}
