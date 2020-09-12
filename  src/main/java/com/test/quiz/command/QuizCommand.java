package com.test.quiz.command;

import java.util.ArrayList;

import com.test.quiz.domain.Answer;
import com.test.quiz.domain.Question;
import com.test.quiz.domain.Quiz;

public class QuizCommand {
	
	private Quiz quiz;
    
    private Question question;
   
   private ArrayList<Answer> answers;

   public Quiz getQuiz() {
       return quiz;
   }

   public void setQuiz(Quiz quiz) {
       this.quiz = quiz;
   }

   public Question getQuestion() {
       return question;
   }

   public void setQuestion(Question question) {
       this.question = question;
   }

   public ArrayList<Answer> getAnswers() {
       return answers;
   }

   public void setAnswers(ArrayList<Answer> answers) {
       this.answers = answers;
   }

   @Override
   public String toString() {
       return "QuizCommand{" + "quiz=" + quiz + ", question=" + question + ", answers=" + answers + '}';
   }
   

}
