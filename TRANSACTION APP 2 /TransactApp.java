import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TransactApp{

    public static void main (String [] args){

    Scanner obtain = new Scanner (System.in);

    List< Map < String, Object > > transactionLog = new ArrayList<>();

    double depositedAmount =0;
    double totalBalance =0;
//    double withrawalAmount;
while(true){    
    String transactionMenu = """
            
                Welcome To Transaction Log App

                    1. Deposit
                    2. Withdrawal
                    3. Show Transactions
                    4. Exit
                    """;
                            
    System.out.printf("%s%n",transactionMenu);

    System.out.print("Enter Your Transaction Menu Log By Number: ");
    int transactionOption = obtain.nextInt();
    obtain.nextLine();
                    
    switch (transactionOption){

        case 1-> {
                  while(true){
                   System.out.print("\nDeposit\n");
                   
                    System.out.print("KINDLY, ENTER YOUR DEPOSIT AMOUNT: ");
                    depositedAmount = obtain.nextDouble();
                    obtain.nextLine();
                    

                    totalBalance += depositedAmount;
                
                    Map<String , Object> transaction = new LinkedHashMap<>();
                    
                    String dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern ("dd/MM/yy hh:mm a"));                   

                    transaction.put("DATE & TIME",dateTime);
                    transaction.put("CATEGORY","Deposit");
                    transaction.put("AMOUNT",depositedAmount);
                    transaction.put("BALANCE",totalBalance);
                    
                    transactionLog.add(transaction);

                    System.out.printf("Your Deposit Of %.2f Was Successful!\nYour Balance Is %.2f\n Date & Time %s%n",depositedAmount,totalBalance,dateTime);

                    System.out.print("Would you like to perform another transaction? Yes/No" );
                    String depositResponse = obtain.nextLine();

                    if(depositResponse.equalsIgnoreCase("No")){
                      System.out.print("\nThank You For Using Our App. Hope To See You Next Time.\n");
                        break;
                        }
                 
                    }//while brace

            }
        case 2-> {
                  while(true){
                    System.out.print("\nWITHDRAWAL\n");

                    System.out.print("\nKINDLY, ENTER YOUR WITHDRAWAL AMOUNT: ");
                    double withdrawalAmount = obtain.nextDouble();
                    obtain.nextLine();

                String dateTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yy hh:mm a"));

                    if(withdrawalAmount > totalBalance){
                        System.out.printf("Insufficent Balance!\nYour Balance Is %.2f\n Date & Time %s",totalBalance, dateTime);} else{
                                   totalBalance -= withdrawalAmount;

                  Map<String, Object> transaction = new LinkedHashMap<>();

                    transaction.put("DATE & TIME",dateTime);
                    transaction.put("CATEGORY","Withdrawal");
                    transaction.put("AMOUNT",withdrawalAmount);
                    transaction.put("BALANCE",totalBalance);
                    
                    transactionLog.add(transaction);
                    
                 System.out.printf("Your Withdrawal Of %.2f Was Successful!\nYour Balance Is %.2f\n Date & Time %s\n", withdrawalAmount,totalBalance,dateTime);

                        }

            System.out.print("\nWould YOu Like To Perform Another Withdrawal? Yes/No \n");
            String withdrawalResponse = obtain.nextLine();

            if (withdrawalResponse.equalsIgnoreCase("No")){
                System.out.print("\nThank You For Using Our App. Hope To See You Next Time.\n");
                        break;
                      
                    }

         }//while brace

} // case 2 brace

        case 3->{

                   System.out.print("\nTransaction History\n\n");

                if (transactionLog.isEmpty()){

                    System.out.print("\n No Transaction Yet Fund Your Account!");
                        break;
                }

            Map<String,Object> transaction = transactionLog.get(0);

            transaction.keySet().forEach(key -> System.out.printf("%-20s", key));
            System.out.println();
            
            for(Map<String, Object> transactions : transactionLog){
            transactions.values().forEach(value -> System.out.printf("%-20s",value));
            System.out.println();

            }

}




        case 4->{
                    System.out.print("\nExit\n");

                    System.out.print("\nThank You For Using Our App!\n");                    
            
                    System.exit(0);
                    
                    

                         }
        default->{
                    System.out.println("Invalid Option Choice!!! choose 1 - 4");


                        }

                }//switch brace
                
            }// overall while loop

        }

}
