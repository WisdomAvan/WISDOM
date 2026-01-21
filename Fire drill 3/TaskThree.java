import java.util.Scanner;

public class TaskThree{

    public static void main(String [] arg){

        Scanner obtain = new Scanner(System.in);
            int [] scores = new int [10];
        for(int count =0; count <= 10; count++){
            System.out.print("Enter Scores");
            int studentScores = obtain.nextInt(); 

                    scores[studentScores]=studentScores;
        }
     }

}
