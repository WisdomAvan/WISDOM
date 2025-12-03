import java.util.Scanner;
    public class Scores {
       public static void main(String [] args){
          Scanner obtain = new Scanner(System.in);

    System.out.print("Enter first scorce:" );
    int firstScore = obtain.nextInt();

    System.out.print("Enter second score:");
    int secondScore = obtain.nextInt();

    System.out.print("Enter third score:");
    int thirdScore = obtain.nextInt();

int totalScore = firstScore + secondScore + thirdScore;
int n = 3;
int averageScore = totalScore/n;

    System.out.printf("Your total scores:" + totalScore);

    System.out.printf("%n Average Score is:" +averageScore);

}




}
