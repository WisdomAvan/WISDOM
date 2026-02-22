import java.util.Scanner;


public class Task1{

    public static void main(String [] args){

        Scanner obtain = new Scanner(System.in);

            System.out.print("\nEnter Any String Either As A Word / Integer:\n");

                String word = obtain.nextLine();
        
        for(int count = word.length()-1; count >= 0; count-- ){

            char alphabet = word.charAt(count);

            System.out.println(alphabet);



                    }



        }


}
