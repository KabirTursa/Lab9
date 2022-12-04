package org.example;

public class QuizScore implements Cloneable {

    private int score;

    public QuizScore(int score_) {
        score = score_;
    }

    public QuizScore(QuizScore other) {
        score = other.getScore();
    }

    public void setScore(int score_) {
        score = score_;
    }

    public int getScore() {
        return score;
    }

    public QuizScore clone() {
        return new QuizScore(this);
    }
}
