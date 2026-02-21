import java.util.Scanner;

public class TaskTeleve{

    public static void main(String [] args){
            int count=0;
        Scanner obtain = new Scanner(System.in);

            System.out.print("Enter string");
                
                String word = obtain.nextLine();

int value=0;
    for(count=0; count < word.length(); count++){

    System.out.printf("%c\n", word.charAt(count));
        
        if(word.charAt(count) =='e')

                 value++;
        
               
}
System.out.print(value);

    }


}
