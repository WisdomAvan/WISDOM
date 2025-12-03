import java.util.Scanner;
public class AgeForecaster{
    public static void main (String [] args){
        Scanner obtain = new Scanner(System.in);

          System.out.print("Enter Your Name: ");
             String name = obtain.nextLine();

               System.out.print("Enter Your Current Age: ");
                  int currentAge = obtain.nextInt();

                      int futureAge = currentAge +1;
                             obtain.close();

    System.out.println(name + " your next age is " + futureAge);




}
}
