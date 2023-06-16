package com.bipin.quizapp.repositories;

import com.bipin.quizapp.model.QuizPojo;
import com.bipin.quizapp.network.ApiService;

import java.util.HashMap;

import javax.inject.Inject;

import retrofit2.Call;

public class QuizRepository {
    private ApiService apiService;

    @Inject
    public QuizRepository( ApiService apiService) {
        this.apiService = apiService;
    }

    public Call<QuizPojo> getQuestions(HashMap<String,String> map) {
        return apiService.getQuizList(map);
    }
}
