package com.test.quiz.command;

import java.util.ArrayList;

import com.test.quiz.domain.Answer;
import com.test.quiz.domain.Question;

public class ProcessQuiz {
	
	 private ArrayList<Question> questions;
	    
	    private ArrayList<Answer> answers;
	    
	    public ArrayList<Question> getQuestions() {
	        return questions;
	    }

	    public void setQuestions(ArrayList<Question> questions) {
	        this.questions = questions;
	    }

	    public ArrayList<Answer> getAnswers() {
	        return answers;
	    }

	    public void setAnswers(ArrayList<Answer> answers) {
	        this.answers = answers;
	    }

	    @Override
	    public String toString() {
	        return "ProcessQuiz{" + "questions=" + questions + ", answers=" + answers + '}';
	    }

}
