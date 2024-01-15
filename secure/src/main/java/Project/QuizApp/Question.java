package Project.QuizApp;

import java.util.Arrays;

public class Question {
    private int id;
    private String question;
    private String opt1[];
    private String answer;

    public Question() {
    }

    public Question(int id, String question, String[] opt1, String answer) {
        this.id = id;
        this.question = question;
        this.opt1 = opt1;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getOpt1() {
        return opt1;
    }

    public void setOpt1(String[] opt1) {
        this.opt1 = opt1;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", opt1=" + Arrays.toString(opt1) +
                ", answer='" + answer + '\'' +
                '}';
    }
}
