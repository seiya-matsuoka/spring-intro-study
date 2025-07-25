package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("hello")
public class HelloViewController {
	
	@GetMapping("view")
	public String helloView() {
		return "hello";
	}
	
	@GetMapping("model")
	public String helloView(Model model) {
		model.addAttribute("msg", "タイムリーフ");
		return "helloThymeleaf";
	}
	
	@GetMapping("modelandview")
	public ModelAndView helloView2(ModelAndView modelAndView) {
		modelAndView.addObject("msg", "タイムリーフ");
		modelAndView.setViewName("helloThymeleaf");
		return modelAndView;
	}
}
