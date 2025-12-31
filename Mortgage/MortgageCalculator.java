import java.util.Scanner;
public class MortgageCalculator{

    public static void main(String [] args){

    Scanner obtain = new Scanner (System.in);

    String proceed ="yes";
    while(true){

    System.out.print("Enter the principle amount: ");
    double principalAmount = obtain.nextDouble();

    System.out.print("Enter the annual interest rate: ");
    double rate = obtain.nextDouble();

    System.out.print("Enter the duration in years: ");
    int year = obtain.nextInt();
    obtain.nextLine();

    double rate_P = rate/(100*12); 

    double monthlyPayment = principalAmount * (rate_P*(Math.pow(1+rate_P,year*12))/(Math.pow(1+rate_P,year*12)-1));


    System.out.printf("Your monthly payment is: %.2f%n", monthlyPayment);


    System.out.print("Do you wish to Procced:Yes/No ");
    proceed = obtain.nextLine();
     
   
    if (proceed.equalsIgnoreCase("No"))
    break;
}
    }

}
