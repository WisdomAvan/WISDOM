import java.util.Scanner;

public class Task4{

    public static void main(String [] args){
        int counter =0;
        Scanner obtain = new Scanner(System.in);

            System.out.print("Enter A String");

              String word = obtain.nextLine();

        for( int count =0; count < word.length(); count++){

            char letter = word.charAt(count);

            if(Character.isLowerCase(letter)){

                    counter++;
        
                }  

             }   
                System.out.println(counter);

        }


}
