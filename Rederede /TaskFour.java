import java.util.Scanner;
import java.util.Random;

public class TaskFour{

    public static void main(String []args){

        Scanner obtain = new Scanner(System.in);
            int numberguessing=0;
          Random random = new Random();


            System.out.print("Guess Any Number");
                    int ask = obtain.nextInt();

            numberguessing = random.nextInt(10)+1;


            for(int count=1; count <= 10; count++){
                     
                if(ask > numberguessing){
                    System.out.println("Too high");}
                   else{
                        System.out.println("Too low");
                      }

                
                   System.out.println("Try again");
                        int reguess = obtain.nextInt();

                        
                    
              }
                
                System.out.printf("You are correct");


    }

}
