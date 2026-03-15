import java.util.Scanner;

public class EventCreation {

    static Scanner obtain = new Scanner(System.in);

    static String[] eventId = new String[20];
    static String[] eventName = new String[20];
    static double[] eventPrices = new double[20];
    static int[] ticketQuantity = new int[20];

    static int eventCounter = 0;

    public static void createEvent() {

        if (eventCounter >= 20) {
            System.out.println("Event storage is full!");
            return;
        }

        System.out.print("Enter Event ID: ");
        eventId[eventCounter] = obtain.nextLine();

        System.out.print("Enter Event Name: ");
        eventName[eventCounter] = obtain.nextLine();

        System.out.print("Total Tickets: ");
        ticketQuantity[eventCounter] = obtain.nextInt();

        System.out.print("Price: ");
        eventPrices[eventCounter] = obtain.nextDouble();
        obtain.nextLine();

        eventCounter++;

        System.out.println("Event created successfully!");
    }
}
