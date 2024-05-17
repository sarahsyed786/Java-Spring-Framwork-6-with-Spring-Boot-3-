import java.util.Scanner;

public class QuestionService {
     Questions[] questions = new Questions[5];
     String[] selection = new String[5];




     public  QuestionService(){

        questions[0] = new Questions(1, "Size of int ","2", "6", "4", "8", "4");

        questions[1] = new Questions(2, "Size of double ","2", "6", "4", "8", "8");

        questions[2] = new Questions(3, "Size of char ","2", "6", "4", "8", "2");

        questions[3] = new Questions(4, "Size of long ","2", "6", "4", "8", "8");

        questions[4] = new Questions(5, "Size of boolean ","2", "6", "1", "8", "1");
        
     }
    
    public void playQuiz(){

        int i =0;
        for(Questions q : questions){
            System.out.println("q.no" + q.getId());

            System.out.println(q.getQuestion());

            System.out.println(q.getOpt1());

            System.out.println(q.getOpt2());

            System.out.println(q.getOpt3());

            System.out.println(q.getOpt4());

            Scanner sc = new Scanner(System.in);
            
            selection[i] = sc.nextLine();

            i++;
            System.out.println();

        }

        System.out.println();
        System.out.println("Your Answer");


        for(String s : selection){
            System.out.println(s);
        }
       

    }

    public void printScore(){
         
        int score = 0;


         for(int i = 0; i<questions.length; i++){
            
            Questions que = questions[i];

            String actualAnswer = que.getAnswer();
            String userAnswer = selection[i];

            if(actualAnswer.equals(userAnswer)){
                score++;
            }
         }
         
         System.out.println("Your Score: " +  score);
    }
}
