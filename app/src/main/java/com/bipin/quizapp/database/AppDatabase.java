package com.bipin.quizapp.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.bipin.quizapp.database.dao.AnswerDao;
import com.bipin.quizapp.database.dao.QuestionDao;
import com.bipin.quizapp.model.Answer;
import com.bipin.quizapp.model.Question;

@Database(entities = {Question.class, Answer.class}, version = 1, exportSchema = false)
public abstract class AppDatabase extends RoomDatabase {
    public abstract QuestionDao quizDao();

    public abstract AnswerDao answerDao();
}