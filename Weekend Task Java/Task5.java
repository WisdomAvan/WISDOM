import java.util.Scanner;

public class Task5{

    public static void main(String [] args){

        Scanner obtain = new Scanner(System.in);
        
            System.out.print("Enter Any String As Words:\n");

                String words = obtain.nextLine().toUpperCase();

        for(int count =0; count < words.length(); count++){

            char letter = words.charAt(count);

            if(letter == 'A'|| letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U'){

                System.out.println(count);

            }


            }

        }


}
