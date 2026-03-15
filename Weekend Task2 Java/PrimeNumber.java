 import java.util.Scanner;

public class PrimeNumber{

    public static void main(String [] args){

        Scanner obtain = new Scanner(System.in);

            System.out.print("Enter Any Integer Number");
            
                int primeNumber = obtain.nextInt();

        primeNumber =toCalculateAPrimeNumber(primeNumber);

        System.out.printf("%d\n",primeNumber);
}

    public static int toCalculateAPrimeNumber(int primeNumber){

       
                boolean isPrime = true;

                    int divisor =2

            for(; divisor <= primeNumber;){

                    
                if( primeNumber % divisor !=0 ){
                 
                    divisor++;
                
                         
             }else{
                isPrime = false;
                    break
        
               if(isPrime){

                
             }  
                
            }
                     
           return primeNumber;             

    }
}
