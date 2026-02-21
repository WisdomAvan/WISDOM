import java.util.Scanner;

public class TaskFourteen{

    public static void main(String [] args){
            int count=0;
        Scanner obtain = new Scanner(System.in);

            System.out.print("Enter string");
                
                String word = obtain.nextLine();

int value=0;
    for(count=0; count < word.length(); count++){

       char alphabet = Character .toUpperCase(word.charAt(count));

                 System.out.println(alphabet);
        
        }

    }


}
