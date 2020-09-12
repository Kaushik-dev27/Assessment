package com.test.quiz.dao;

import java.util.ArrayList;

import com.test.quiz.dao.EntityDAO;
import com.test.quiz.domain.Answer;

public interface AnswerDAO extends EntityDAO<Answer> {
	   public ArrayList<Answer> getAnswersByQuestionId(Integer id);

}
