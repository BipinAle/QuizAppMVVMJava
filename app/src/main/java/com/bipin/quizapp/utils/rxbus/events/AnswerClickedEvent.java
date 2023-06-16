package com.bipin.quizapp.utils.rxbus.events;

import com.bipin.quizapp.model.Answer;
import com.bipin.quizapp.model.Question;

public class AnswerClickedEvent {
    Question question;
    Answer answerItem;

    public AnswerClickedEvent(Question question, Answer answerItem) {
        this.question = question;
        this.answerItem = answerItem;
    }

    public Question getQuestion() {
        return question;
    }

    public Answer getAnswerItem() {
        return answerItem;
    }
}
