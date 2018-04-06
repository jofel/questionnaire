package com.herokuapp.questionnaire.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.herokuapp.questionnaire.entities.Question;
import com.herokuapp.questionnaire.repositories.QuestionRepository;

@Service
public class QuestionService {

	@Autowired
	private QuestionRepository questionRepository;
	
	public List<Question> getAllQuestions(){
		return questionRepository.findAll();
	}

	public void insert(Question question) {
		questionRepository.save(question);
		
	}
}
