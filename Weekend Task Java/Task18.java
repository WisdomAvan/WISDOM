import java.util.Scanner;

public class Task18{

    public static void main(String [] args){
            int decimal=0;
               
        Scanner obtain = new Scanner(System.in);
            
            System.out.print("\n Enter any binary number:\n");
                
                String binaryNumber = obtain.nextLine();

                int power = binaryNumber.length()-1;
    
        for(int count =0; count < binaryNumber.length(); count++){
    
            int digit = binaryNumber.charAt(count) -'0';

                decimal+=digit * Math.pow(2,power);

                    power--;

            }

                System.out.print("Decimal="+decimal);


    }


}
