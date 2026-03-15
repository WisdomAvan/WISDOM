public class Wallet {

    private double balance = 0;

    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public boolean withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return false;
        }

        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return false;
        }

        balance -= amount;
        System.out.println("Payment successful. Remaining balance: " + balance);
        return true;
    }

    public boolean payForTicket(double ticketPrice) {
        return withdraw(ticketPrice);
    }
}
