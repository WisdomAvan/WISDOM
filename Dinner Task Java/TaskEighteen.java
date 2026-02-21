import java.util.Scanner;

public class TaskEighteen{
    
    public static void main(String [] args){

        Scanner obtain = new Scanner(System.in);
               int total =0; 
            System.out.print("Enter number");

                int num = obtain.nextInt();

            for(int count= 0; count < num; count++){

                    total+=count;
                        
                }

                System.out.println(total);
        }

}
