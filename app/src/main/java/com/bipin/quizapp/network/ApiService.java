package com.bipin.quizapp.network;

import com.bipin.quizapp.model.QuizPojo;

import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

public interface ApiService {
    @GET("/api.php")
    Call<QuizPojo> getQuizList(@QueryMap Map<String, String> queryParameters);
}