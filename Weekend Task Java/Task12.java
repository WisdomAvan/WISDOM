import java.util.Scanner;

public class Task12{

    public static void main(String [] args){
        
        Scanner obtain = new Scanner(System.in);
            int exponential=1;
        
        System.out.print("Enter a number");

          int number = obtain.nextInt();

          int number2 = obtain.nextInt(); 

        for(int count =1; count <= number2; count++){

            exponential *= number; 

            


        }


            System.out.println(exponential);




        }


}
