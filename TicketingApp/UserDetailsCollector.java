import java.util.Scanner;

public class UserDetailsCollector{


        static Scanner obtain = new Scanner(System.in);
        static String [] signupDetails = new String [20];
        static String [] loginDetails =  new String [20];


    public static void signupDetails(){
        int count =0;
        int userCounter=0;
        
    while(true){
        System.out.println("Kindly Enter Your Username "+ (count +1) +" :");
             signupDetails[count] = obtain.nextLine();

        System.out.print("\nKindly Enter Your Email " + (count +1)+ " :");
            signupDetails[count] = obtain.nextLine();

            System.out.print("\nEnter Your Password " + (count +1)+ " :");
            loginDetails[count] = obtain.nextLine();
            
                userCounter++;
            System.out.print("\n Would You Like To Continue Yes/No");
            String response = obtain.nextLine();
            if(response.equalsIgnoreCase("No")){
                        break;

                loginDetails();
             
                }
           } 
        }
        
            public static void loginDetails(){

        int count =0;
        int userCounter=0;
    
        System.out.println("Kindly Enter Your Username "+ (count +1) +" :");
             loginDetails[count] = obtain.nextLine();
            
        System.out.print("\nEnter Your Password " + (count +1)+ " :");
            loginDetails[count] = obtain.nextLine();
            
                userCounter++;

          System.out.print("\n Would You Like To Continue Yes/No");
            String response = obtain.nextLine();
            if(response.equalsIgnoreCase("No")){
                        break;

         }
     
}
