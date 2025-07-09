package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.servise.BusinessLogic;
import com.example.demo.servise.impl.SampleLogicImpl;
import com.example.demo.servise.impl.TestLogicImpl;

@Configuration
public class AppConfig {
	@Bean(name = "test")
	public BusinessLogic dataLogic() {
		return new TestLogicImpl();
	}
	
	@Bean(name = "sample")
	public BusinessLogic viewLogic() {
		return new SampleLogicImpl();
	}
}
