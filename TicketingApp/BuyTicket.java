



static void buyTicket() {


        if (totalEvents == 0) {
            System.out.println("No events available!");
            return;
        }

        EventList.listOfEvents();

        System.out.print("Select Event Index: ");
        int eventIndex = obtain.nextInt();
        obtain.nextLine();

        if (eventIndex < 0 || eventIndex >= totalEvents) {
            System.out.println("Invalid event index!");
            return;
        }

                System.out.print("Enter Quantity: ");
                    int quantity = obtain.nextInt();
                     obtain.nextLine();

                EventList.listOfUsers();
        
                System.out.print("Enter User Index: ");
                    int userIndex = obtain.nextInt();
                     obtain.nextLine();
    
                 if (userIndex < 0 || userIndex >= totalUsers) {
                     System.out.println("Invalid user index!");
                        return;
             }
            
                   double totalCost = quantity * eventPrices[eventIndex];


                    if (userBalances[userIndex] >= totalCost) {
                        if (ticketsAvailable[eventIndex] >= quantity) {
                             userBalances[userIndex] -= totalCost;
                               ticketsAvailable[eventIndex] -= quantity;
                            
                                Wallet.deposit(amount);
                                withdraw( amount);
                                payForTicket(ticketPrice) 
                    purchasedTickets[userIndex][totalTicketsPerUser[userIndex]++] = eventIndex;
                        System.out.println("Ticket purchased successfully!");

                         } 
                           else {
                                 System.out.println("Not enough tickets available!");
                             }  
                            else {
                                     System.out.println("Insufficient balance!");
                                    }
    }
