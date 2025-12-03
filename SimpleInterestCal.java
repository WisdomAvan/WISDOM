import java.util.Scanner;
public class SimpleInterestCal{
public static void main(String [] args){
Scanner obtain = new Scanner(System.in);
System.out.print("Principle Amount:");
int principle = obtain.nextInt();

System.out.print("Rate:");
double rate = obtain.nextDouble();

System.out.print("Time in years:");
int time = obtain.nextInt();

int percentage = 100;

int simpleInterest = principle * rate * time/percentage;

System.out.printf("Interest Rate is: %d" + simpleInterest);


}

}
