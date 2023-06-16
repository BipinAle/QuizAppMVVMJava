package com.bipin.quizapp.database.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.bipin.quizapp.model.Answer;
import com.bipin.quizapp.model.Question;

import java.util.List;

@Dao
public interface AnswerDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(Answer question);

    @Query("SELECT * FROM answer_table")
    List<Question> getAllAnswers();

    @Query("DELETE FROM answer_table")
    void clearData();


}
