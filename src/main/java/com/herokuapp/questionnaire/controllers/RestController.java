package com.herokuapp.questionnaire.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.herokuapp.questionnaire.entities.Question;
import com.herokuapp.questionnaire.services.QuestionService;

@Controller
public class RestController {

	@Autowired
	private QuestionService questionService;

	@Value("${spring.application.name}")
	private String appName = "Hello World";

	@RequestMapping("/")
	public String welcome(Model model) {
		model.addAttribute("questions", questionService.getAllQuestion());
		return "home";
	}

	@RequestMapping("/contact")
	public String contact(Map<String, Object> model) {
		return "contact";
	}

	@RequestMapping(value = "/questions")
	public String notesList(Model model) {
		model.addAttribute("questions", questionService.getAllQuestion());
		return "questions";
	}

	@PostMapping(value = "/question")
	public void publishQuestion(@RequestBody Question question) {
		questionService.saveQuestion(question);
	}
}
