package com.bipin.quizapp.di;

import com.bipin.quizapp.repositories.QuizRepository;
import com.bipin.quizapp.viewmodel.QuizViewModel;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ViewModelComponent;
import dagger.hilt.android.scopes.ViewModelScoped;

@Module
@InstallIn(ViewModelComponent.class)
public class MyViewModelModule {

    @Provides
    @ViewModelScoped
    public QuizViewModel provideMyViewModel(QuizRepository repository) {
        return new QuizViewModel(repository);
    }
}
