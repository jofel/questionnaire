package com.herokuapp.questionnaire.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.herokuapp.questionnaire.entities.Question;
import com.herokuapp.questionnaire.services.QuestionService;

@Controller
public class RestController {

	@Autowired
	private QuestionService questionService;

	@RequestMapping("/")
	public String index(Model model) {
		// model.addAttribute("questions", questionService.getAllQuestion());
		return "index";
	}

	@RequestMapping(path = "/questions/delete/{id}", method = RequestMethod.GET)
	public String deleteProduct(@PathVariable(name = "id") String id) {
		questionService.deleteQuestionById(id);
		return "redirect:/questions";
	}

	@RequestMapping(path = "/questions", method = RequestMethod.GET)
	public String getAllQuestion(Model model) {
		model.addAttribute("questions", questionService.getAllQuestion());
		return "questions";
	}

	@RequestMapping(path = "/questions/edit/{id}", method = RequestMethod.GET)
	public String editProduct(Model model, @PathVariable(value = "id") String id) {
		model.addAttribute("question", questionService.findQuestionById(id));
		return "edit";
	}

	@RequestMapping(path = "questions", method = RequestMethod.POST)
	public String saveQuestion(Question question) {
		questionService.saveQuestion(question);
		return "redirect:/questions";
	}

	@RequestMapping(path = "/questionnaire", method = RequestMethod.GET)
	public String getAllQuestionToQuestionnaire(Model model) {
		model.addAttribute("questions", questionService.getAllQuestion());
		return "questionnaire";
	}

}
