package com.bipin.quizapp.model;

import androidx.room.TypeConverters;

import com.bipin.quizapp.database.converters.QuizTypeConverter;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class QuizPojo {
    @SerializedName("response_code")
    @Expose
    private Integer responseCode;

    @TypeConverters(QuizTypeConverter.class)
    @SerializedName("results")
    @Expose
    private List<Question> questions;

    public Integer getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public List<Question> getSinlgleQuizs() {
        return questions;
    }

    public void setSinlgleQuizs(List<Question> questions) {
        this.questions = questions;
    }
}
