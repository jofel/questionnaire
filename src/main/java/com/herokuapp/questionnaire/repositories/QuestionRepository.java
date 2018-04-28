package com.herokuapp.questionnaire.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.herokuapp.questionnaire.entities.Question;

public interface QuestionRepository extends JpaRepository<Question, String> {

}
