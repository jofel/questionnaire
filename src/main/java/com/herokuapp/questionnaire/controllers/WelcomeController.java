package com.herokuapp.questionnaire.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@Value("${spring.application.name}")
	private String appName = "Hello World";
	
	@RequestMapping("/")
	public String welcome(Map<String, Object> model) {
		model.put("appName", this.appName);
		return "welcome";
	}
}
