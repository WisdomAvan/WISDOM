import java.util.Scanner;
public class LargestNumber{

    public static void main(String [] args){

        Scanner obtain = new Scanner(System.in);
        
        int currentNum =0;
        int previousNum = < 0;

       
        for(int count = 1;count <= 10;count++){
        
        System.out.print("Enter Any Integer Number: ");
        int num = obtain.nextInt();
        if(currentNum == previousNum){
           System.out.println("This Number IS Duplicate");
            }


        }

    }

}
