import java.util.Scanner;

public class EventCreation{

    static Scanner obtain= new Scanner(System.in);

    static String[] eventId = new String[20];
    static String[] eventName = new String[20];
    static double[] eventPrices = new double[20];
    static int[] ticketQuantity = new int[20];

    
    static int eventCounter =0;

    public static void createEvent() {
        int count =0;
      while(true){

        if (count >= 20) {
            System.out.println("Event storage is full!");
           
        }

        System.out.print("Enter event ID: ");
        eventId[count] = obtain.nextLine();

        System.out.print("Enter event name: ");
        eventName[count] = obtain.nextLine();

        System.out.print("Total tickets: ");
        ticketQuantity[count] = obtain.nextInt();

        System.out.print("Price: ");
        eventPrices[count] = obtain.nextDouble();
        obtain.nextLine();

        eventCounter++; 

        System.out.println("Event created successfully!");

        System.out.println("Would You Like To Add More Event? Yes/No: ");
            String eventPlannerResponse = obtain.nextLine();

            if(eventPlannerResponse.equalsIgnoreCase("No")){
                break;
            }
        }
    }
}
