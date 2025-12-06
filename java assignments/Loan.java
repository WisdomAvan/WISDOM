import java.util.Scanner;
      public class Loan {
          public static void main (String [] args) {
            Scanner obtain = new Scanner(System.in);

    System.out.print("Enter Annual Income:");
        double annualIncome = obtain.nextDouble();

            System.out.print("Enter Year Of Experience:");
            int yearOfExperience = obtain.nextInt();

               System.out.print("Enter Credit Score:");
                int score = obtain.nextInt();

                    double creditedloan = Math.pow(annualIncome,5);

if((score > 650 && score =< 850) && yearOfExperience > 2 && annualIncome > 350000) {
    System.out.printf("You are eligible for a loan of: %d, creditedloan");

}
   System.out.println("Sorry you are not eligble for this loan");


}



}
