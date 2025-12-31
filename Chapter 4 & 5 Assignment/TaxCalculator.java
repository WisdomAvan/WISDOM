import java.util.Scanner;
public class TaxCalculator {
    public static void main(String [] args){

    Scanner obtain = new Scanner(System.in);

    int counter =1;

    while (counter <= 3){

    System.out.print("Enter Your Name: ");
    String name = obtain.nextLine();
    
    System.out.print("Enter Amount earned: ");
    double earning = obtain.nextDouble();

    obtain.nextLine();

    double taxpercent = (earning * 0.15);
    double taxpercent2 =(earning * 0.20);

    if(earning == 30000){
    System.out.println("Your tax is: since is: " + taxpercent);
    }else if(earning >30000){
    System.out.println("Your tax is: "+ taxpercent2);
          
}
counter++;

}









    }

}
