import java.util.Scanner;
import java.security.SecureRandom;

public class TaskThree{

    public static void main(String []args){

        Scanner obtain = new Scanner(System.in);
            int randomguessing=0;
          SecureRandom randomNumber = new SecureRandom();

            for(int count=0; count <= 10; count++){
        
                System.out.println("Guess Any Number");
                    int guessedNumber = obtain.nextInt();

                    randomguessing = randomNumber.nextInt(10);
                    if (guessedNumber == randomguessing){
                System.out.println("Correct");}
                    else{
                           System.out.println("Wrong Guess");
        }

                    if(guessedNumber > randomguessing){
                        System.out.println("Too High");
                    }else{
                            System.out.println("Too Low");
                        }
                
              }


        }
}
