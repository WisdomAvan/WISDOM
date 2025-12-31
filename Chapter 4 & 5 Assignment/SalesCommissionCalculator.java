import java.util.Scanner;
public class SalesCommissionCalculator{
    public static void main(String [] args){

    Scanner obtain = new Scanner(System.in);
    
    int counter = 1;
    double salary = 200;
    double commissionofitem =0;

    while (counter > 0){

    System.out.print("Enter amount of item: ");
    double itemamount = obtain.nextDouble();
    
    commissionofitem = (itemamount * 0.09);
        System.out.println("Your commission is: " + commissionofitem);

        double actualSalary = salary + commissionofitem;

        counter++;
 
    System.out.printf("Your Total Salary For the Week Is: %.2f%n" ,actualSalary);


}













    }
}
