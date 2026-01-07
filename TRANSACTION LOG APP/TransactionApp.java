import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class TransactionApp {

    public static void main(String[] args) {

        Scanner obtain = new Scanner(System.in);

        List<Map<String, Object>> transactionLog = new ArrayList<>();
        double totalBalance = 0;

        while (true) {
            
            String transactionOption = """

                    Welcome To Transaction Log App

                    1. Deposit
                    2. Withdrawal
                    3. Show Transactions
                    4. Exit
                    """;

            System.out.println(transactionOption);

            System.out.print("Kindly Enter Any Option Of Your Choice By Number: ");
            int option = obtain.nextInt();
            obtain.nextLine();

            switch (option) {
                case 1-> {

                    while (true) {
                        System.out.print("\nEnter the amount to deposit: ");
                        double depositAmount = obtain.nextDouble();
                        obtain.nextLine(); 

                        totalBalance += depositAmount;
                        String dateTime = LocalDateTime.now().format(
                                DateTimeFormatter.ofPattern("dd/MM/yy hh:mm a"));

                        Map<String, Object> transaction = new LinkedHashMap<>();

                        transaction.put("DATE & TIME", dateTime);
                        transaction.put("CATEGORY", "Deposit");
                        transaction.put("AMOUNT", depositAmount);
                        transaction.put("BALANCE", totalBalance);

                        transactionLog.add(transaction);

                        System.out.printf("\nYour deposit of %.2f was successful! " +
                                "\nCurrent Balance: %.2f\nDate & Time: %s\n",depositAmount, totalBalance, dateTime);

                        System.out.print("Do you want to continue depositing? Yes/No: ");
                        String depositResponse = obtain.nextLine();

                        if (depositResponse.equalsIgnoreCase("No")) 
                                break;
                    }
                }

                case 2 -> { 

                    while (true) {
                        System.out.print("\nEnter the amount to withdraw: ");
                        double withdrawalAmount = obtain.nextDouble();
                        obtain.nextLine(); 

                        String dateTime = LocalDateTime.now().format(
                                DateTimeFormatter.ofPattern("dd/MM/yy hh:mm a"));

                        if (withdrawalAmount > totalBalance) {
                            System.out.printf("Insufficient balance! Current Balance: %.2f\n", totalBalance);
                        } else {
                            totalBalance -= withdrawalAmount;

                            Map<String, Object> transaction = new LinkedHashMap<>();

                            transaction.put("DATE & TIME", dateTime);
                            transaction.put("CATEGORY", "Withdrawal");
                            transaction.put("AMOUNT", withdrawalAmount);
                            transaction.put("BALANCE", totalBalance);

                            transactionLog.add(transaction);

                            System.out.printf("\nYour withdrawal of %.2f was successful! " +
                                    "\nCurrent Balance: %.2f\nDate & Time: %s\n",withdrawalAmount, totalBalance, dateTime);
                        }

                        System.out.print("Do you want to continue withdrawing? Yes/No: ");
                        String withdrawalresponse = obtain.nextLine();
                        if (withdrawalresponse.equalsIgnoreCase("No")) 
                                break;
                    }
                }

                case 3 -> { 
                           System.out.println("\nTransactions History:");

                    if (transactionLog.isEmpty()) {
                        System.out.println("\nNo transactions yet.");
                        break;
                    }

                   

                    
                    Map<String, Object> firstTransaction = transactionLog.get(0);

                    firstTransaction.keySet().forEach(key -> System.out.printf("%-20s", key));
                    System.out.println();

                    
                    for (Map<String, Object> t : transactionLog) {
                        t.values().forEach(value -> System.out.printf("%-20s", value));
                        System.out.println();
                    }
                }

                case 4 -> { 
                    System.out.println("\nExit!");
                    System.exit(0);
                }

                default -> System.out.println("\nInvalid option! Please choose 1-4.");
            }
        }
    }
}

