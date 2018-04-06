package com.herokuapp.questionnaire.controllers;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
	public String welcome(Map<String, Object> model) {
		model.put("appName", this.appName);
		return "home";
	}
	
	@GetMapping(value="/questions")
	public List<Question> questions(){
		return questionService.getAllQuestions();
	}
	
	@PostMapping(value="/question")
	public void publishQuestion(@RequestBody Question question) {
		questionService.insert(question);
	}
}
