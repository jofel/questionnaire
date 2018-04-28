package com.herokuapp.questionnaire.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.herokuapp.questionnaire.entities.Question;
import com.herokuapp.questionnaire.repositories.QuestionRepository;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	private QuestionRepository questionRepository;

	@Override
	public void saveQuestion(Question question) {
		questionRepository.save(question);
	}

	@Override
	public void updateQuestion(Question question) {
		questionRepository.save(question);
	}

	@Override
	public List<Question> getAllQuestion() {
		return questionRepository.findAll();
	}

	@Override
	public void deleteQuestionById(String id) {
		questionRepository.deleteById(id);
	}

	@Override
	public Object findQuestionById(String id) {
		return questionRepository.findById(id);
	}

}
