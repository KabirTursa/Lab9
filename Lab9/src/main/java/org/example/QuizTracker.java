package org.example;
import java.util.ArrayList;

public class QuizTracker implements Cloneable {
    ArrayList<QuizScore> scores;
    public QuizTracker(ArrayList<QuizScore> scores_) {
        scores = scores_;
    }

    public void add(QuizScore quizScore) {
        scores.add(quizScore);
    }

    public QuizTracker clone() {
        ArrayList<QuizScore> temp= new ArrayList<>();
        for (int i = 0; i < scores.size(); i++) {
            temp.add(scores.get(i).clone());
        }
        return new QuizTracker(temp);
    }
}
