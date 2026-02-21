import java.util.Scanner;

public class TaskSeventeen{
    
    public static void main(String [] args){

        Scanner obtain = new Scanner(System.in);
               int value =0; 
            System.out.print("Enter number");

                String num = obtain.nextLine();
            for(int count= 0; count < num.length(); count++){

                    
                        value++;
                }

                System.out.print(value);
        }

}
