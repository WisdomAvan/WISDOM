import java.util.Scanner;
public class AverageScore{
public static void main(String [] args){
Scanner obtain = new Scanner(System.in);
System.out.print("Enter your first score:");

int score1 = obtain.nextInt();
System.out.print("Enter your second score:");
int score2 = obtain.nextInt();

System.out.print("Enter your third score:");
int score3 = obtain.nextInt();

System.out.print("Enter your fourth score:");
int score4 = obtain.nextInt();

System.out.print("Enter your fifth score:");
int score5 = obtain.nextInt();


int sum = score1 + score2 + score3 + score4 + score5;
int n = 5;
int averageScore = sum/n;


if(averageScore >= 70);
   System.out.print("Execellent");

if(averageScore > 60 && averageScore < 70)
   System.out.print("Very Good");

if(averageScore >= 45 && averageScore < 60);
  System.out.print("Good");

if(averageScore < 45);
  System.out.print("Needs Improvement");
    


}





}
