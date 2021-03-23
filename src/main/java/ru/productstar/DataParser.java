package ru.productstar;

import ru.productstar.dto.Question;
import ru.productstar.dto.QuestionType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataParser {
    public List<Question> parseQuestions(List<String> data) {
        ArrayList<Question> questions = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            String questionType = data.get(i);
            if (questionType.contains("questionWithAnswers")) {
                String questionText = data.get(++i);
                List<String> answers = Arrays.asList(data.get(++i).split(";"));
                String correctAnswer = data.get(++i);
                questions.add(new Question(QuestionType.QUESTION_WITH_ANSWERS, questionText, correctAnswer, answers));
            } else {
                String questionText = data.get(++i);
                String correctAnswer = data.get(++i);
                questions.add(new Question(QuestionType.OPEN_QUESTION, questionText, correctAnswer, Collections.emptyList()));
            }
        }
        return questions;
    }
}
