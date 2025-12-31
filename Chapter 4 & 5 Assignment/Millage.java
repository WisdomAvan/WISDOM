import java.util.Scanner;
public class Millage{
public static void main(String [] args){

Scanner obtain = new Scanner(System.in);



int counter = 1;

while(counter !=-1 ){

    counter ++;

    System.out.print("Enter Number for Miles: ");
    int miles = obtain.nextInt();
    System.out.print("Enter Number For Gallon: ");
    int gallon = obtain.nextInt();

    double perGallon = miles/gallon;
    
    if (miles ==-1 && gallon ==-1){
            break;


}

System.out.println("The Mile Per Gallon is: " + perGallon);








           }






    }
}
