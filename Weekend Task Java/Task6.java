import java.util.Scanner;


public class Task6{

    public static void main(String [] args){

        Scanner obtain = new Scanner(System.in);

            System.out.print("Enter a String");

               String words = obtain.nextLine();

        for(int count =0; count < words.length(); count++){


            char letters = words.charAt(count);

                System.out.println((int)(letters));

         }






        }


}
