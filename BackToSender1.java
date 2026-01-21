import java.util.Scanner;

public class BackToSender1{

   static final int NUMBER_PERCENTAGE =100;

             static   final int BASE_PAY = 5000;

               static  double payment;

                  static  boolean whoIsNext = true;


    public static void main(String [] args){

           
        String paymentMenu = ("""
    
            WELCOME TO BACK TO SENDER LOGISTICS COMMISSION TABLE

        ______________________________________________________
       |                 |                 |                  |
       | COLLECTION RATE |AMOUNT PER PARCEL|    BASE PAY      |
       |_________________|_________________|__________________|
       |                 |                 |                  |
       | LESS THAN 50%   |    160          |     5000         |
       |_________________|_________________|__________________|
       |                 |                 |                  |
       |  50 - 59%       |    200          |     5000         |
       |_________________|_________________|__________________|
       |                 |                 |                  |
       |  60 - 69%       |    250          |     5000         |
       |_________________|_________________|__________________|
       |                 |                 |                  |
       |   >= 70%        |    500          |     5000         |
       |_________________|_________________|__________________| 
            
        """);

            System.out.print(paymentMenu);


            Scanner obtain = new Scanner(System.in);
         while (whoIsNext){
          System.out.print("\nEnter The Number Of Successful Delivery  Today 0 - 100 \n");
            int deliveredPackage = obtain.nextInt();

                obtain.nextLine(); 
        if(deliveredPackage < 0 ){
                    System.out.print("ENTER THE CORRECT DETAILS REQUIRED!!!");
                        continue;
                }else{System.out.print("\nEnter The Number Of Successful Delivery  Today 0 - 100\n ");
                        deliveredPackage = obtain.nextInt();
                    }
                
                double percentageOfPackage = deliveredPackage/NUMBER_PERCENTAGE;
                
             if(percentageOfPackage >=0 || percentageOfPackage < 50){
                payment =(deliveredPackage * 160) + BASE_PAY;
                            
                 System.out.print(payment);   
 
               }
                 else if(percentageOfPackage > 50 || percentageOfPackage <=59){
                        payment = (deliveredPackage * 200) + BASE_PAY;
        
                            System.out.print(payment);    
         
                        }
                            else if(percentageOfPackage > 60 || percentageOfPackage <= 69){
                                payment = (deliveredPackage * 250) + BASE_PAY;
        
                                   System.out.print(payment); 

                                }
                                    else if(percentageOfPackage >= 70){

                                        payment = (deliveredPackage * 500) + BASE_PAY;

                                            System.out.print(payment); 

                        }

                             System.out.print("Would You Like To Continue For The Next Rider?Yes/No ");
                                        String response = obtain.nextLine();
                                if(response.equalsIgnoreCase("No")){
                                    System.out.print("\nThank You!!!\n");
                                            break;
            
                                }
                
                }

        }

}
                  


