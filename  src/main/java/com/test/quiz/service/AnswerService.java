package com.test.quiz.service;

import java.util.ArrayList;
import java.util.List;

import com.test.quiz.domain.Answer;

public interface AnswerService {

	 public int createAnswer(Answer a);

	    public ArrayList<Answer> getAnswerList();

	    public Answer getAnswerById(Integer id);

	    public ArrayList<Answer> getAnswerByQuestion(Integer id);

	    public void updateAnswer(Answer a);
	    
	    public void updateAnswers (List<Answer> answers);
}
