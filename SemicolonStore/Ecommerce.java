import java.util.Scanner;
import java.util.ArrayList;


public class Ecommerce {

     static double subTotal =0;
     static String moreItem="yes";
     static double discount=0;
     static int count = 0;
     static String nameOfCashier="";

    static ArrayList <String > nameOfItem = new ArrayList<>();

    static ArrayList<Double> pricePerUnit = new ArrayList<>();

    static ArrayList<Integer> quantityOfItem = new ArrayList<>();


    
public static void main(String [] args){

        Scanner obtain = new Scanner(System.in);

        System.out.print("Enter Date In This Formart Day/Month/Year: ");
        String date = obtain.nextLine();
        
        System.out.print("Enter Time In This Formart HH:M:AM/PM: ");
        String time = obtain.nextLine();

        System.out.print("Enter Customer's Name: ");
        String name = obtain.nextLine();  

        toGetPriceAndItemsFromTheArray(
        
}

public static double toGetPriceAndItemsFromTheArray(){ 
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
                    
        
        System.out.print("Would You Like To Add More Items yes/No: ");
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
    return subTotal;
 }

      
public static double toKnowTheDiscountPrice(double discount){
        double discountPercentage = discount / 100; 

        return discountPercentage;
}


public static double toKnowThePriceDiscount(double subTotal , double discountPercentage){
        double discountPrice = subTotal * discountPercentage;
        return discountPrice;
    }
       

public static double toKnowTheVAtPrice(double subTotal){         
        double vatPrice = subTotal * 0.075;
        return vatPrice;
       }

public static double overAllTotal(double subTotal, double discountPrice, double vatPrice){
      double billTotal = subTotal - discountPrice + vatPrice;
        return billTotal;

 }       
        


public static void toPrintAllReceipts(){        

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
   THIS IS  NOT A RECEIPT KINDLY PAY:%.2f
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
