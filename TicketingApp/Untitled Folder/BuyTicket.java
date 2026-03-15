import java.util.Scanner;

public class BuyTicket {

    static Scanner obtain = new Scanner(System.in);

    public static void eventTicket(Wallet wallet) {

        if (EventCreation.eventCounter == 0) {
            System.out.println("No events available.");
            return;
        }

        EventList.listOfEvent();

        System.out.print("Select Event Number: ");
        int choice = obtain.nextInt();
        obtain.nextLine();

        int index = choice - 1;

        if (index < 0 || index >= EventCreation.eventCounter) {
            System.out.println("Invalid selection.");
            return;
        }

        System.out.print("Enter quantity: ");
        int quantity = obtain.nextInt();
        obtain.nextLine();

        if (quantity > EventCreation.ticketQuantity[index]) {
            System.out.println("Not enough tickets available.");
            return;
        }

        double totalPrice = quantity * EventCreation.eventPrices[index];

        if (wallet.payForTicket(totalPrice)) {

            EventCreation.ticketQuantity[index] -= quantity;
            System.out.println("Ticket purchased successfully!");
        }
    }
}
