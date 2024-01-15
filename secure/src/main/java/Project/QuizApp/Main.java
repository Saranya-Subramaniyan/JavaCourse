package Project.QuizApp;

public class Main {
    public static void main(String[] args) {

        QuestionsService questionsService=new QuestionsService();
questionsService.playQuiz();
questionsService.printScore();
    }
}
