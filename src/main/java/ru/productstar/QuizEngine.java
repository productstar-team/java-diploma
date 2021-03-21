package ru.productstar;

import ru.productstar.dto.Question;

import java.util.List;

public class QuizEngine {
    private final FileReader fileReader = new FileReader("quiz.txt");
    private final DataParser dataParser = new DataParser();

    private List<Question> questions;

    public void run() {
        questions = loadQuestions();
        printIntroduction();

        startQuiz();
    }

    void startQuiz() {
        for (Question question: questions) {
            printQuestion(question);
            String userAnswer = System.console().readLine();

            while (!isUserAnswerCorrect(userAnswer, question)) {
                if (userAnswer.equals("q")) {
                    return;
                }
                printRetry();
                userAnswer = System.console().readLine();
            }

            congratulateUserWithCorrectAnswer();
        }
        congratulateUserWithQuizFinish();
    }

    private void congratulateUserWithQuizFinish() {

    }

    private void congratulateUserWithCorrectAnswer() {

    }

    private void printRetry() {

    }

    boolean isUserAnswerCorrect(String userAnswer, Question question) {
        return true;
    }

    void printQuestion(Question question) {

    }

    List<Question> loadQuestions() {
        List<String> data = fileReader.readFile();
        return dataParser.parseQuestions(data);
    }

    void printIntroduction() {

    }
}
