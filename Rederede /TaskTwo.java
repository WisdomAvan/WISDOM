import java.util.Scanner;
import java.security.SecureRandom;

public class TaskTwo{

    public static void main(String []args){

        Scanner obtain = new Scanner(System.in);
            int numberguessing=0;

          SecureRandom randomNumber = new SecureRandom();

            for(int count=0; count <= 10; count++){
        
                System.out.println("Guess Any Number");
                    int guessedNumber = obtain.nextInt();
                        obtain.nextLine();

                    numberguessing = randomNumber.nextInt(10);
                            if (guessedNumber == numberguessing){
                                System.out.println("Correct");}
                    else{
                           System.out.println("Wrong Guess");
        }
              }


        }
}
