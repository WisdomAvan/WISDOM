import java.util.Scanner;
public class CreditLimitCalculator {
    public static void main(String [] args){
        Scanner obtain = new Scanner(System.in);

        int counter =1;        

        while(counter !=-1 ) {

        System.out.print("Enter Account Number: ");
        int accountNumber = obtain.nextInt();

        System.out.print("Enter Bal At The start Of month: ");
        int balanceStartOfMonth = obtain.nextInt();

        System.out.print("Enter Item Charged By Customer: ");
        int itemCharged = obtain.nextInt();
        
        System.out.print("Enter Credit Applied To Customer:");
        int totalCreditApplied = obtain.nextInt();

        System.out.print("Enter Credit Limit Allowed: ");
        int creditLimitAllowed = obtain.nextInt();

        int newBalance = (balanceStartOfMonth + itemCharged)- totalCreditApplied;
            
            counter++;

        System.out.println("New Balance is: " + newBalance);

        if(newBalance > creditLimitAllowed){
        System.out.println("Credit limit exceeded");
} else{

        System.out.println("Credit not exceeded");

}

    }       
        










    }

}
