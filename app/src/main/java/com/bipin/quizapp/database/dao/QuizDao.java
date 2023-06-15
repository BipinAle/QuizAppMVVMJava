package com.bipin.quizapp.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.bipin.quizapp.model.Question;

import java.util.List;

@Dao
public interface QuizDao {
    @Insert
    void insert(Question question);

    @Query("SELECT * FROM questions")
    List<Question> getAllQuestions();
}
