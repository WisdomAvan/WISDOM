import java.util.Scanner;
    public class Measurement {
       public static void main(String [] args){
          Scanner obtain = new Scanner(System.in);
            
           System.out.print("Enter temperature in kelvin:");
           double temp1 = obtain.nextDouble();
           double tempInC = temp1 - 273.15;
        System.out.printf("Temperature:  %.5f%n" , tempInC);

        System.out.print ("Enter temperature in kelvin:");
        double temp2 = obtain.nextDouble();   
        double tempInF = (temp2 - 273.15) * 9/5 + 32;
    
     System.out.printf("Fahraheit:%.2f%n " , tempInF );      
            



}
}
