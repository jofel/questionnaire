package com.herokuapp.questionnaire.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import com.herokuapp.questionnaire.entities.Question;

@Service
public class InitApplicationService {

	private static final Logger LOGGER = LoggerFactory.getLogger(InitApplicationService.class);

	@Autowired
	QuestionService questionService;

	@EventListener(ApplicationReadyEvent.class)
	public void initializeTestData() {
		LOGGER.info("Initialize test data");

		questionService.saveQuestion(new Question("Topic 1", "title 1",
				"question 1 question 1 question 1 question 1question 1question 1", 1));
		questionService.saveQuestion(new Question("Topic 1", "title 1",
				"question 1 question 1 question 1 question 1question 1question 1", 1));
		questionService.saveQuestion(new Question("Topic 1", "title 1",
				"question 1 question 1 question 1 question 1question 1question 1", 1));
		questionService.saveQuestion(new Question("Topic 1", "title 1",
				"question 1 question 1 question 1 question 1question 1question 1", 1));
		questionService.saveQuestion(new Question("Topic 1", "title 1",
				"question 1 question 1 question 1 question 1question 1question 1", 1));
		questionService.saveQuestion(new Question("Topic 1", "title 1",
				"question 1 question 1 question 1 question 1question 1question 1", 1));
		questionService.saveQuestion(new Question("Topic 1", "title 1",
				"question 1 question 1 question 1 question 1question 1question 1", 1));
		questionService.saveQuestion(new Question("Topic 1", "title 1",
				"question 1 question 1 question 1 question 1question 1question 1", 1));
		questionService.saveQuestion(new Question("Topic 1", "title 1",
				"question 1 question 1 question 1 question 1question 1question 1", 1));
		questionService.saveQuestion(new Question("Topic 1", "title 1",
				"question 1 question 1 question 1 question 1question 1question 1", 1));

		LOGGER.info("Initialization completed");
	}
}
