package com.example.demo.example.impl;

import com.example.demo.example.Example;
import com.example.demo.service.SomeService;

import lombok.RequiredArgsConstructor;

//@Component
@RequiredArgsConstructor
public class ConstructorInjectionOmitLombokExample implements Example {

	private final SomeService someService;

	@Override
	public void run() {
		someService.doService();
	}
}
