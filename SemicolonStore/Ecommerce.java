import java.util.Scanner;
import java.util.ArrayList;
public class Ecommerce {

    public static void main(String [] args){

        Scanner obtain = new Scanner(System.in);

        System.out.print("Enter Date In This Formart Day/Month/Year: ");
        String date = obtain.nextLine();
        
        System.out.print("Enter Time In This Formart HH:M:AM/PM: ");
        String time = obtain.nextLine();

        System.out.print("Enter Customer's Name: ");
        String name = obtain.nextLine();

    ArrayList <String > nameOfItem = new ArrayList<>();

    ArrayList<Double> pricePerUnit = new ArrayList<>();

    ArrayList<Integer> quantityOfItem = new ArrayList<>();
    
      
        double subTotal =0;
        String moreItem="yes";
        double discount=0;
        int count = 0;
       String nameOfCashier="";

        while(true){

        System.out.print("Enter item name");
        nameOfItem.add(obtain.nextLine());
        
        System.out.print("Enter item price ");
        pricePerUnit.add(obtain.nextDouble());
        obtain.nextLine();

        System.out.print("Enter item quantity");
        quantityOfItem.add(obtain.nextInt());
        obtain.nextLine();

        subTotal += pricePerUnit.get(count) * quantityOfItem.get(count);
                    
        
        System.out.print("Add More Items yes/No: ");
        moreItem = obtain.nextLine(); 
      

        if(moreItem.equalsIgnoreCase("No")){
                
        System.out.print("Enter Discount: ");
        discount = obtain.nextDouble();
        obtain.nextLine();
        
        System.out.print("Enter Cashier's Name: ");
        nameOfCashier = obtain.nextLine();
        break;
            
        }
            count++;
}

       
        

        double discountPercentage = discount / 100; 

        double discountPrice = subTotal * discountPercentage;
    
                
        double vatPrice = subTotal * 0.075;
       
      double billTotal = subTotal - discountPrice + vatPrice;


        
        
        

        System.out.printf("""
SEMICOLON STORES
MAIN BRANCH
LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
TEL: 08067126750
DATE:   %s \t %s
Cashier:%s
Customer Name:%s
==========================================================
            ITEM       QTY         PRICE       TOTAL(NGN) 
----------------------------------------------------------  
     """,date,time,nameOfCashier, name);

    for(int index = 0; index < nameOfItem.size(); index++){

        double productSum = quantityOfItem.get(index) * pricePerUnit.get(index);

    System.out.printf("              %8s %6d %11.2f %13.2f%n",nameOfItem.get(index),quantityOfItem.get(index),pricePerUnit.get(index),productSum);


}    

System.out.printf(          """          
----------------------------------------------------------
                        Sub Total:    %.2f
                        
                        Discount:     %.2f
                
                        Vat @ 7.5%%:   %.2f
===========================================================
                        Bill Total:  %.2f
                        

===========================================================
   THIS IS  NOT AN RECEIPT KINDLY PAY:%.2f
===========================================================
""",subTotal,discountPrice,vatPrice,billTotal,billTotal);


        System.out.print("How Did The Customer Give To you: ");
        double customerAmount = obtain.nextDouble();

        double balance = customerAmount - billTotal;

        
        System.out.printf("""
SEMICOLON STORES
MAIN BRANCH
LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
TEL: 08067126750
DATE:   %s \t %s
Cashier:%s
Customer Name:%s
==========================================================
            ITEM       QTY         PRICE       TOTAL(NGN) 
----------------------------------------------------------
""",date,time,nameOfCashier, name);


    for(int index = 0; index < nameOfItem.size(); index++){



    double productSum = quantityOfItem.get(index) * pricePerUnit.get(index);

    System.out.printf("              %8s %6d %11.2f %13.2f%n", nameOfItem.get(index),quantityOfItem.get(index),pricePerUnit.get(index),productSum);

} 

System.out.printf("""           
----------------------------------------------------------

                        Sub Total:    %.2f
                        
                        Discount:     %.2f
                
                        Vat @ 7.5%%:   %.2f

===========================================================

                        Bill Total:  %.2f
                        
                        Amount Paid: %.2f   
                        
                        Balance:    %.2f

===========================================================
   THANK YOU FOR YOUR PATRONAGE
===========================================================
""",subTotal,discountPrice,vatPrice,billTotal, customerAmount, balance);




    }

}
