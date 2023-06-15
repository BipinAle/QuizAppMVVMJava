package com.bipin.quizapp.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.bipin.quizapp.R;
import com.bipin.quizapp.viewmodel.QuizViewModel;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {

    @Inject
    QuizViewModel quizViewModel;

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = findViewById(R.id.progressBar);
        quizViewModel.getQuestions();
        progressBar.setVisibility(View.VISIBLE);
        quizViewModel.questionLiveData.observe(this, questions -> {
            //get data from api and save it to room db
            progressBar.setVisibility(View.GONE);
        });
        quizViewModel.errorObservable.observe(this, throwable -> {
            progressBar.setVisibility(View.GONE);
            Toast.makeText(MainActivity.this, throwable.getMessage(), Toast.LENGTH_SHORT).show();
        });

    }
}