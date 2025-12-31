import java.util.Scanner;

public class ChrismasSong{

    public static void main(String [] args){


        String chrismas ="""
                  Press 1 On the first day of Chrismas
                  Press 2 On the second day of Chrismas 
                  Press 3 On the third day of Chrismas
                  Press 4 On the fourth day of Chrismas
                  Press 5 On the fifth day of Chrismas
                  Press 6 On the sixth day of Chrismas
                  Press 7 On the seventh day of Chrismas
                  Press 8 On the eighth day of Chrismas
                  Press 9 On the ninth day of Chrismas
                  Press 10 On the tenth day of Chrismas
                  Press 11 On the eleventh day of Chrismas
                  Press 12 On the twelfth day of Chrismas
                            """;
    System.out.print(chrismas);

        Scanner obtain = new Scanner(System.in);

        int userinput = obtain.nextInt();
        
for(userinput = 1; userinput <=12; userinput ++){

    if(userinput<=0 && userinput >12){

       System.out.print("Invalid Input");

}// for if brace 

}//  for loop brace


switch(userInput){

    case 1-> {System.out.println("On the first day of Chrismas");

            System.out.println("""My true love gave to me %nA partridge in a pear tree""");
                               
                System.out.print(first);


    




}// brace for case 1

//switch



        }//method brace

}// class
