import java.util.Scanner;

public class FinancialApplication{

    public static void main(String [] args){

        Scanner obtain = new Scanner(System.in);

            System.out.print("Enter Loan Amount");
                
                double loanAmount = obtain.nextDouble();
            
            System.out.print("Enter Years Of Payment");

                double years = obtain.nextDouble();
               
        System.out.printf("Interest Rate \t   Monthly Payment \t Total Payment");

            double totalMonthlyAmount=0;

             double monthlyLoan =0;
            
             double count=0;

            for(count =5.0; count <= 10.0; count+=0.25){

                    double monthlyRate = (count)/(100 * 12); 
            
                    monthlyLoan = (loanAmount * (monthlyRate * Math.pow( 1 + monthlyRate, years * 12)))/( Math.pow( 1 + monthlyRate, years * 12)-1);

                    totalMonthlyAmount = monthlyLoan * years * 12;

            System.out.printf("\n%.3f   \t    %.2f  \t          %.2f\n" , count , monthlyLoan , totalMonthlyAmount);
        }
            
    }

}
