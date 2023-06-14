package com.bipin.quizapp.viewmodel;

import androidx.lifecycle.ViewModel;

import com.bipin.quizapp.repositories.QuizRepository;

import javax.inject.Inject;

public class QuizViewModel extends ViewModel {
    private QuizRepository quizRepository;

    @Inject
    public QuizViewModel(QuizRepository quizRepository) {
        this.quizRepository = quizRepository;
    }

}
