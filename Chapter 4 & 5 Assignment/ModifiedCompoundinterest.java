public class ModifiedCompoundinterest{

    public static void main (String [] args){

    
    double principle = 1000;
    double rate = 0.05; 
                             
    for(int year = 5; year <= 10; year++){
   
    double  amount = principle *Math.pow(1 + rate, year);

    System.out.printf("The amount for 5%% is: %.3f%n" , amount);


        }
    double rate_1 = 0.06; 
                             
    for(int year = 5; year <= 10; year++){
   
    double  amount = principle *Math.pow(1 + rate, year);

    System.out.printf("The amount for 5%% is: %.3f%n" , amount);
        }

    }

}



