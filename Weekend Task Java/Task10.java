import java.util.Scanner;

public class Task10{

    public static void main(String [] args){

        Scanner obtain = new Scanner(System.in);
                int reversed =0;
            System.out.print(" Enter any number to comfirm a palindrome");

               int number = obtain.nextInt();

            int orignalNumber = number;

    while(number !=0){

        int digits = number % 10;

            reversed = reversed * 10 + digits;

                number/=10;


        

                }

            if(orignalNumber == reversed){
            
                    System.out.println("Is a Panlindrome");

                 }else{

                    System.out.println(" Is Not a Panlindrome");


            }



        }


}
