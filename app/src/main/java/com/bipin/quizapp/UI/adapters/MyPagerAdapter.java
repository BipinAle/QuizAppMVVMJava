package com.bipin.quizapp.UI.adapters;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.bipin.quizapp.UI.fragments.QuizFragment;
import com.bipin.quizapp.model.Question;

import java.util.ArrayList;
import java.util.List;

public class MyPagerAdapter extends FragmentStateAdapter {

    List<Question> questions;
    private List<QuizFragment> fragments = new ArrayList<>();


    public MyPagerAdapter(@NonNull FragmentActivity fragmentActivity, List<Question> questions) {
        super(fragmentActivity);
        this.questions = questions;
    }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        // Return the fragment for the corresponding position
        QuizFragment quizFragment = QuizFragment.newInstance(questions.get(position), position);
        fragments.add(quizFragment);
        return quizFragment;
    }

    @Override
    public int getItemCount() {
        // Return the total number of pages
        return questions.size();
    }

    public QuizFragment getFragment(int position) {
        return fragments.get(position);
    }


}