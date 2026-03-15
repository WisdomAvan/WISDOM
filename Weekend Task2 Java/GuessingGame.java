import java.util.Scanner;
import java.security.SecureRandom;

public class GuessingGame{
    
    public static void main(String [] args){

        Scanner obtain = new Scanner(System.in);
        
        SecureRandom random = new SecureRandom();

        int secretNumber = 1 + random.nextInt(10);

    for(int counter =1; counter <= 20; counter++ ){

            System.out.print("\nGuess Any Integer: ");
                
                int guessNumber = obtain.nextInt();
            
         if(guessNumber == secretNumber){ 
                  System.out.printf("You Guessed Right %d\n", secretNumber);
                       
            }else if (guessNumber > secretNumber){

                    System.out.print("Too High");

            }else {

                    System.out.print("Too Low");
            }
              

          }

     }      

}
