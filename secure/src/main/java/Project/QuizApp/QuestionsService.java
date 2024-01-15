package Project.QuizApp;

import java.util.Scanner;

public class QuestionsService {
    Question[] question=new Question[5];
    String selection[]=new String[5];

    public QuestionsService() {
    String[] str={"2","4","8","1"};
        question[0]=new Question(1,"size of int",str,"4");
        question[1]=new Question(2,"size of byte",str,"1");
        question[2]=new Question(3,"size of double",str,"8");
        question[3]=new Question(4,"size of char",str,"2");
        question[4]=new Question(5,"size of long",str,"8");

    }

    public void playQuiz(){
        for(int i =0;i< question.length;i++){
//            System.out.println(question[i]);
            System.out.println(question[i].getId()+") "+question[i].getQuestion());
            String[] string=question[i].getOpt1();
            for(int j=0;j<string.length;j++){
                System.out.println(j+1+")"+string[j]+" ");
            }
            Scanner sc=new Scanner(System.in);
            selection[i]=sc.nextLine();
        }

    }
    public void printScore(){
        int score=0;
        for (int i=0;i<question.length;i++){
            if(question[i].getAnswer().equals(selection[i])){
                score++;
            }
        }
        System.out.println("Total score : "+score+" out of 5");
    }
}
