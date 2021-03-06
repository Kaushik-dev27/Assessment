package com.test.quiz.command;

import java.util.ArrayList;

import com.test.quiz.domain.Answer;
import com.test.quiz.domain.Question;
import com.test.quiz.domain.Quiz;

public class QuizFormCommand {
	
private Quiz quiz;
    
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

    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    @Override
    public String toString() {
        return "QuizFormCommand{" + "quiz=" + quiz + ", questions=" + questions + ", answers=" + answers + '}';
    }

}
