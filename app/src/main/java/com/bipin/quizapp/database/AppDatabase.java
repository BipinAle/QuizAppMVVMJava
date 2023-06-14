package com.bipin.quizapp.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.bipin.quizapp.database.dao.QuizDao;
import com.bipin.quizapp.model.Quiz;

@Database(entities = {Quiz.class}, version = 1, exportSchema = true)
public abstract class AppDatabase extends RoomDatabase {
    public abstract QuizDao quizDao();
}