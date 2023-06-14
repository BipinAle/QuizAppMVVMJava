package com.bipin.quizapp.repositories;

import com.bipin.quizapp.database.dao.QuizDao;
import com.bipin.quizapp.network.ApiService;

import javax.inject.Inject;

public class QuizRepository {
    private ApiService apiService;
    private QuizDao quizDao;

    @Inject
    public QuizRepository(QuizDao quizDao, ApiService apiService) {
        this.apiService = apiService;
        this.quizDao = quizDao;
    }
}
