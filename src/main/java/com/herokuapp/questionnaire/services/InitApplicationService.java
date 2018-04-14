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

		questionService
				.saveQuestion(new Question("Topic 1", "title 1", "A kollégium környezete biztonságos, védett.", 1));
		questionService.saveQuestion(new Question("Topic 1", "title 1", "Kollégiumi könyvtárt hasznosnak találom.", 1));
		questionService
				.saveQuestion(new Question("Topic 1", "title 1", "A WiFi hálózatra szükségem van a szobában is.", 1));
		questionService.saveQuestion(new Question("Topic 1", "title 1", "A zuhanyzók állapota megfelelő", 1));
		questionService.saveQuestion(
				new Question("Topic 1", "title 1", "Megfelelő mennyiségű sportkör van a kollégiumban", 1));
		questionService.saveQuestion(
				new Question("Topic 1", "title 1", "Nem zavar, hogy nincs világítás este a folyosón.", 1));
		questionService
				.saveQuestion(new Question("Topic 1", "title 1", "Nem zavar, hogy a lift nem üzemel éjszaka.", 1));
		questionService.saveQuestion(new Question("Topic 1", "title 1", "Nincs hideg a szobámban télen sem.", 1));
		questionService.saveQuestion(new Question("Topic 1", "title 1", "Szoba bútorzata elfogadható.", 1));
		questionService.saveQuestion(
				new Question("Topic 1", "title 1", "Elégedett vagyok a Kollégium Bizottság munkájával.", 1));

		LOGGER.info("Initialization completed");
	}
}
