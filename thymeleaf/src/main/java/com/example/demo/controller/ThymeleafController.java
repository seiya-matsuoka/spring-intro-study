package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.Member;

@Controller
public class ThymeleafController {
	
	@GetMapping("show")
	public String showView(Model model) {
		Member member = new Member(1, "会員01");
		model.addAttribute("name", "太郎");
		model.addAttribute("mb", member);
		return "main";
	}
}
