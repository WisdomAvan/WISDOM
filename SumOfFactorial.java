import java.util.Scanner;

public class SumOfFactorial{

    public static void main(String [] args){

        Scanner obtain = new Scanner(System.in);

            System.out.print("\nEnter Number: ");

                int factorialNumber = obtain.nextInt();

                int factorial =1;

        for(int count=2; count <=factorialNumber; count++){

            int temporaryNumber =0;

            for(int counter = 2; counter<=count; counter++){

                temporaryNumber += factorial;

            }
                
            factorial = temporaryNumber;            
            System.out.print(factorial);
                
        }

     }

}
