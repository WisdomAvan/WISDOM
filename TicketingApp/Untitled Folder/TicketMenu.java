import java.util.Scanner;

public class TicketMenu {

    static Scanner obtain = new Scanner(System.in);
    static Wallet wallet = new Wallet();

    public static void menu() {

        while (true) {

            System.out.println("\n--- Ticket System Menu ---");
            System.out.println("1. Register User");
            System.out.println("2. Create Event");
            System.out.println("3. List Events");
            System.out.println("4. Buy Ticket");
            System.out.println("5. Deposit Money");
            System.out.println("6. Exit");

            System.out.print("Choose From 1 - 6 For Menu: ");
            int choice = obtain.nextInt();
            obtain.nextLine();

            switch (choice) {

                case 1:
                    UserDetailsCollector.signupDetails();
                    break;

                case 2:
                    EventCreation.createEvent();
                    break;

                case 3:
                    EventList.listOfEvent();
                    break;

                case 4:
                    BuyTicket.eventTicket(wallet);
                    break;

                case 5:
                    depositMoney();
                    break;

                case 6:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid option!");
            }
        }
    }

    public static void depositMoney() {

        System.out.print("Enter amount to deposit: ");
        double amount = obtain.nextDouble();
        obtain.nextLine();

        wallet.deposit(amount);
    }
}
