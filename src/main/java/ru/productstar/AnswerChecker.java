package ru.productstar;

import ru.productstar.dto.Question;
import ru.productstar.dto.QuestionType;

public class AnswerChecker {
    public boolean isUserAnswerCorrect(String userAnswer, Question question) {
        if (question.getQuestionType() == QuestionType.OPEN_QUESTION) {
            return question.getCorrectAnswer().equalsIgnoreCase(userAnswer);
        }
        return question.getCorrectAnswer().equals(userAnswer);
    }
}
