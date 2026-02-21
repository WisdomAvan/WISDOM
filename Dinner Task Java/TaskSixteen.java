import java.util.Scanner;

public class TaskSixteen{

    public static void main(String [] args){
            int count=0;
        Scanner obtain = new Scanner(System.in);

            System.out.print("Enter string");
                
                String word = obtain.nextLine();

int value=0;
    for(count=0; count < word.length(); count++){

        char alphabet = word.charAt(count);

       if (alphabet== 'a'|| alphabet =='e' || alphabet =='i' || alphabet =='o'|| alphabet =='u'){

                 System.out.printf("%c%n",value);
                        value++;
        
            }

        }

    }


}
