import java.util.Scanner;

public class Task2{

    public static void main(String [] args){

        Scanner obtain = new Scanner(System.in);

            System.out.print("Enter An Integer");

                int numbers = obtain.nextInt();
             
                int reversed =0;

       while(numbers !=0){ 

            int digits = numbers % 10;
        
            reversed = reversed * 10 + digits;

            numbers/=10;

        }

System.out.println(reversed);





    }



}
