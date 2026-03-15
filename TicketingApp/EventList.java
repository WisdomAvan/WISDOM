
public class EventList{

    static String [] eventName = new String [20];
    static String[] eventId = new String [20];
    static double [] eventPrices = new double [20];
    static int [] ticketQuantity = new int [20];

    static int eventCounter =0;

//    String [] buyerEmail = new String [20];
//    String [] boughEventIndex = new String [20];
//    int [] quantityBought = new String [20];
//    
//    int purchaseCounter 0;


    public static void listOfEvent(){

        System.out.print("\nList Of Events");

       if (eventCounter ==0){
            
        System.out.print("No Event Available For Purchase");    
    }

        for(int eventList =0; eventList < eventCounter; eventList++){

            System.out.printf(" %s \t %s \t %d \t %d\n", eventName[eventCounter], eventId[eventCounter], eventPrices[eventCounter], ticketQuantity[eventCounter]);


        }

    }

} 
