public class TicketMenu{


    public static void menu() {
        while (true) {
            System.out.println("\n--- Ticket System Menu ---");
            System.out.println("1. Register User");
            System.out.println("2. Create Event");
            System.out.println("3. List Events");
            System.out.println("4. Buy Ticket");
            System.out.println("5. Deposit Money");
            System.out.println("6. List Users");
            System.out.println("7. Exit");


            System.out.println("Choose From 1 - 7 For Menu")
            int choice = obtain.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> UserDetailsCollector.signupDetails();
                case 2 -> EventCreation.createEvent();
                case 3 -> EventList.listOfEvents();
                case 4 -> BuyTicket.eventTicket();
                case 5 -> depositMoney();
                case 6 -> listUsers();
                case 7 -> {
                    System.out.println("Goodbye!");
                    return;
                }
                default -> System.out.println("Invalid option!");
            }
        }
    }
}


}
