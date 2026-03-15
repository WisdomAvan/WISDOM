import java.util.Scanner;

public class Class2{

    public static void main(String [] args){

//            Scanner obtain = new Scanner(System.in);
//
//                System.out.print("Enter a number\n");
//
                    String name = ("kashamadupe");

        for(int count =0; count < name.length(); count++){
            
           for(int index =0; index < count; index++){

                System.out.print(" ");
            }
           for (int counter = count; counter < name.length(); counter++){
                    char letter = name.charAt(counter)
                System.out.print(letter);
         }
System.out.println();

        }

   }

}
