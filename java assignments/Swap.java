import java.util.Scanner;
    public class Swap {
    public static void main(String [] args){
    Scanner obtain = new Scanner(System.in);
System.out.print("Enter a first number");
int firstNumber = obtain.nextInt();

System.out.print("Enter second number");
int secondNumber = obtain.nextInt();


int tempNumber = firstNumber;

firstNumber = secondNumber;
secondNumber = tempNumber;

System.out.print("First Number:" + firstNumber, "Second Number:" + secondNumber);





}
}
