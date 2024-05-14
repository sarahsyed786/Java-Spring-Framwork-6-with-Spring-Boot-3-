import java.util.Scanner;
public class QuestionService extends Questions{
     Questions q = new Questions();
     String[] ans = new String[5];
    
    public void playQuiz(){

        int selection = 0; 
        for(int i = 0; i<questions.length; i++){
            System.out.println("Q.no" + i + " " + questions[i] );

            for(int j = 0; j < options[i].length; j++){
                System.out.print( "  " + "  " + options[i][j] ); 
            }
            System.out.println();

            Scanner sc = new Scanner(System.in);
            ans[selection++] = sc.nextLine();
          
        }

        System.out.println();
        System.out.println();
        System.out.println("Your Answers:");


        for(String a : ans ){
            System.out.println(a);
        } 

    }

    public void checkAns(){
         
        int score = 0;


         for(int i = 0; i<ans.length; i++){
            String userAns = ans[i];
            if(answers[i].equals(userAns)){
                score++;
            }
         }
         System.out.println("Your Score: " +  score);
    }
}
