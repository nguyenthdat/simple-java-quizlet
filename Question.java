package CS1102;

import java.awt.*;
import javax.swing.*;

public abstract class Question {
    String ask(){
        question.setVisible(true);
        return question.answer;
    }
    static int nQuestions = 0;
    static int nCorrect = 0;
    QuestionDialog question;
    String correctAnswer;
    Question(String question) {
        this.question = new QuestionDialog();
        this.question.setLayout(new GridLayout(0,1));
        this.question.add(new JLabel(" "+question+" ",JLabel.CENTER));
    }
    void initQuestionDialog() {
        this.question.setModal(true);
        this.question.pack();
        this.question.setLocationRelativeTo(null);
    }
    void check(){
        nQuestions++;
        String answer = ask();
        if (answer.equals(correctAnswer)){
            JOptionPane.showMessageDialog(null, "Correct!");
            nCorrect+=1;
        }
        else {
            JOptionPane.showMessageDialog(null, "Incorrect. Please try again.");
        }
    }
    void showResults() {
        JOptionPane.showMessageDialog(null, "You have answer " + nQuestions + " questions.");
        JOptionPane.showMessageDialog(null, "Your point is " + nCorrect);
    }
}
