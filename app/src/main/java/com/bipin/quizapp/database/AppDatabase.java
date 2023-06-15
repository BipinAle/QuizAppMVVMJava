package com.bipin.quizapp.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.bipin.quizapp.database.converters.QuizTypeConverter;
import com.bipin.quizapp.database.dao.QuizDao;
import com.bipin.quizapp.model.Question;

@Database(entities = {Question.class}, version = 1, exportSchema = false)
@TypeConverters(QuizTypeConverter.class)
public abstract class AppDatabase extends RoomDatabase {
    public abstract QuizDao quizDao();
}