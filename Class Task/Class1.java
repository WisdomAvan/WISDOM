import java.util.Scanner;

public class Class1{

    public static void main(String [] args){

            Scanner obtain = new Scanner(System.in);

                System.out.print("Enter a number\n");

                    int number = obtain.nextInt();

        for(int count =1; count <=number; count++){

            

            for (int counter =number; counter >=count; counter--){

                System.out.print(" ");
         }

            for(int index = count; index >=1; index--){

                System.out.print(index);
            }
             System.out.println();   
        }
            
   }

}
