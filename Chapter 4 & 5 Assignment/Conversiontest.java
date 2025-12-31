import java.util.Scanner;
public class Conversiontest{

    public static void main(String [] args){

    Scanner obtain = new Scanner(System.in);
    System.out.print("Enter The Distance In Miles: ");
    
        checkdistanceInkilo();
        checkdistanceInMiles();
    
    }

public static void checkdistanceInkilo(double distance){   
    double distance = obtain.nextDouble();
    double distanceInkilo = distance * 1.60934;
    System.out.println("The Distance in Kilometer Is: "+distanceInkilo);
    
    }

public static void checkdistanceInMiles(double distance_1){

    System.out.print("Enter The Distance In kilometer: ");
    double distance_1= obtain.nextDouble();
        
    double distanceInMiles = distance_1 /1.60934;
    System.out.println("The Distance In Miles Is: "+distanceInMiles);

   } 

}
