package com.bipin.quizapp.repositories;

import com.bipin.quizapp.database.dao.QuizDao;
import com.bipin.quizapp.model.QuizPojo;
import com.bipin.quizapp.network.ApiService;

import java.util.HashMap;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.http.QueryMap;

public class QuizRepository {
    private ApiService apiService;
    private QuizDao quizDao;

    @Inject
    public QuizRepository(QuizDao quizDao, ApiService apiService) {
        this.apiService = apiService;
        this.quizDao = quizDao;
    }

    public Call<QuizPojo> getQuestions(HashMap<String,String> map) {
        return apiService.getQuizList(map);
    }
}
