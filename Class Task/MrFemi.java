import java.util.Scanner;

public class MrFemi{

        static int value=0;
    public static void main(String [] args){

        Scanner obtain = new Scanner(System.in);

            System.out.print("\nEnter Integer Number");

                int number1 = obtain.nextInt();
                
                int number2 = obtain.nextInt();

        ifNumberIsLesserThanZero(number2);

        division(number1 , number2);
         System.out.print(value);   
    }

public static int ifNumberIsLesserThanZero(int number2){
    
                    if(number2==0){
                         
                      
             }
                     return 0;
        }
public static int division(int number1 , int number2){

        for(; number1 >= number2 ; ){
            
                    value++;
                number1 = number1 - number2;
            
        }        
            return value;   
    }

    

}
