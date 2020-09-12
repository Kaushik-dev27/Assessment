package com.test.quiz.dao;

import java.util.ArrayList;

import com.test.quiz.dao.EntityDAO;
import com.test.quiz.domain.Answer;
import com.test.quiz.domain.Question;

public interface QuestionDAO  extends EntityDAO<Question> {
	
	 public ArrayList<Answer> loadPossibleAnswer(Question q);  
	    
	    public ArrayList<Question> findQuestionByQuizId (Integer id);

}
