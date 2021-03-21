package ru.productstar.dto;

import java.util.List;

public class Question {
    private QuestionType questionType;
    private String text;
    private String correctAnswer;
    private List<String> answerOptions;

    public Question(QuestionType questionType, String text, String correctAnswer, List<String> answerOptions) {
        this.questionType = questionType;
        this.text = text;
        this.correctAnswer = correctAnswer;
        this.answerOptions = answerOptions;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public String getText() {
        return text;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public List<String> getAnswerOptions() {
        return answerOptions;
    }
}
