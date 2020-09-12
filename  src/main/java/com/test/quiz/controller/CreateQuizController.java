package com.test.quiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.quiz.command.QuizCommand;
import com.test.quiz.domain.Answer;
import com.test.quiz.domain.Quiz;
import com.test.quiz.service.AnswerService;
import com.test.quiz.service.QuestionService;
import com.test.quiz.service.QuizService;

public class CreateQuizController {
	
	  @Autowired
	    QuizService quizService;

	    @Autowired
	    QuestionService questionService;

	    @Autowired
	    AnswerService answerService;
	    
	    int quizId;

	    @RequestMapping(value = "admin/createQuiz", method = RequestMethod.POST)
	    @ResponseBody
	    public Quiz handleCreateQuiz(@RequestBody QuizCommand cmd) {
	        try {
	            if(cmd.getQuiz().getId() == 0){
	                quizId = quizService.createQuiz(cmd.getQuiz());
	                cmd.getQuestion().setQuiz_id(quizId);
	                int questionId = questionService.createQuestion(cmd.getQuestion());
	                cmd.getAnswers().forEach((Answer answer) -> {
	                    answer.setQuestion_id(questionId);
	                    answerService.createAnswer(answer);
	                });
	            }else{
	                cmd.getQuestion().setQuiz_id(cmd.getQuiz().getId());
	                int questionId = questionService.createQuestion(cmd.getQuestion());
	                cmd.getAnswers().forEach((Answer answer) -> {
	                    answer.setQuestion_id(questionId);
	                    answerService.createAnswer(answer);
	                });
	            }
	        } catch (DuplicateKeyException ex) {
	            ex.printStackTrace();
	        }
	        return cmd.getQuiz();
	    }

}
