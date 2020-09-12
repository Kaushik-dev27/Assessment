package com.test.quiz.service;

import java.util.ArrayList;

import com.test.quiz.command.ScoresWrapper;
import com.test.quiz.domain.Answer;
import com.test.quiz.domain.Game;
import com.test.quiz.domain.Question;

public interface GameService {
	
	public void updateGame(Game g);

    public Game startNewGame(int userId, int quizId);

    public int checkCorrectAnswer(ArrayList<Answer> answers);

    public int createUserAnswer(int gameId, int questionId, int answerId);

    public String processScore(ArrayList<Question> quest, ArrayList<Answer> ans);

    public ArrayList<ScoresWrapper> highScores();

    public ArrayList<ScoresWrapper> userHighScores(int userId);

}
