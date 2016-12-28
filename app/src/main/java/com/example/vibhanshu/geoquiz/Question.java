package com.example.vibhanshu.geoquiz;

/**
 * Created by Vibhanshu on 19/12/16.
 */

public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public Question(int textResId, boolean AnswerTrue){
        mTextResId = textResId;
        mAnswerTrue = AnswerTrue;
    }

}
