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

		questionService.saveQuestion(new Question("A kollégium környezete biztonságos, védett."));
		questionService.saveQuestion(new Question("Kollégiumi könyvtárt hasznosnak találom."));
		questionService.saveQuestion(new Question("A WiFi hálózatra szükségem van a szobában is."));
		questionService.saveQuestion(new Question("A zuhanyzók állapota megfelelő."));
		questionService.saveQuestion(new Question("Nem zavar, hogy nincs világítás este a folyosón."));
		questionService.saveQuestion(new Question("Nem zavar, hogy a lift nem üzemel éjszaka."));

		LOGGER.info("Initialization completed");
	}
}
