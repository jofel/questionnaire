package com.herokuapp.questionnaire.services;

import java.util.List;

import com.herokuapp.questionnaire.entities.Question;

public interface QuestionService {

	// public abstract Question getEmployeeById(int id);

	public abstract void saveQuestion(Question question);

	public abstract void updateQuestion(Question question);

	public abstract void deleteQuestionById(String id);

	public abstract List<Question> getAllQuestion();

	public abstract Object findQuestionById(String id);

	// @Autowired
	// private QuestionRepository questionRepository;
	//
	// public List<Question> getAllQuestions(){
	// return questionRepository.findAll();
	// }
	//
	// public void insert(Question question) {
	// questionRepository.save(question);
	//
	// }
}
