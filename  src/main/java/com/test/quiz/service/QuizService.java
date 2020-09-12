package com.test.quiz.service;

import java.util.List;

import com.test.quiz.domain.Quiz;

public interface QuizService {
	
	public int createQuiz(Quiz q);

    public List<Quiz> getQuizList();
    
    public List<Quiz> getQuizListWithQuestions();

    public Quiz getQuizById(Integer id);

    public void updateQuiz(Quiz q);

    public void deleteQuiz(Integer id);
    
    public void loadQuestions(Quiz q);
    
    public void loadGames(Quiz q);
    

}
