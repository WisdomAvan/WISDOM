import java.util.Scanner;

public class Class4{

    public static void main(String [] args){

        Scanner obtain = new Scanner(System.in);
            
           System.out.print("Enter Number");
            int number = obtain.nextInt();

        for(int count =1; count <=number; count++){
        
         for(int space= 1; space <=number - count; space++){

                System.out.print(" ");
        }

            for(int index =1; index <=2*count-1; index++){
                
                    System.out.print("*");
                    

                }

                System.out.println();
        }

        


    }

}
