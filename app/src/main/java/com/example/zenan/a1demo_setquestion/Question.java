package com.example.zenan.a1demo_setquestion;

/**
 * Created by Zenan on 7/7/2017.
 */

public class Question {
    private String question;
    private String right;
    private String wrong1;
    private String wrong2;
    private String wrong3;
    private String wrong4;

    public Question(String _question, String _right, String _wrong1, String _wrong2, String _wrong3, String _wrong4){
        question = _question;
        right = _right;
        wrong1 = _wrong1;
        wrong2 = _wrong2;
        wrong3 = _wrong3;
        wrong4 = _wrong4;
    }

    public boolean SetQuestion(String _question){
        question = "";
        question = _question;
        return question.isEmpty();
    }

    public boolean SetRight(String _right){
        right = "";
        right = _right;
        return right.isEmpty();
    }

    public boolean SetWrong(String _wrong1, String _wrong2, String _wrong3, String _wrong4){
        wrong1 = wrong2 = wrong3 = wrong4 = "";
        wrong1 = _wrong1;
        wrong2 = _wrong2;
        wrong3 = _wrong3;
        wrong4 = _wrong4;
        return wrong1.isEmpty()&&wrong2.isEmpty();
    }

    public String[] GetQuestion(){
        String[] ret = {question, right, wrong1, wrong2, wrong3, wrong4};
        return ret;
    }
}
