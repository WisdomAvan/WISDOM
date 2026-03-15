import java.util.Scanner;

public class Kashamadupe{

    public static void main(String [] args){

        Scanner obtain = new Scanner(System.in);

//            System.out.print("\nEnter Number\n");
//
//               String name = obtain.nextLine();

        String name= "Kashamadupe";
        for(int count =0; count <name.length(); count++){

            for(int space = name.length(); space >=1; space--){
                    System.out.print("");

}
            
                    for(int index= 0; index <count; index++){
                    System.out.print(name.charAt(index));

}
System.out.println();   
            } 
                    for(int count =0; count < name.length(); count++){

            for(int space = name.length(); space >=1; space--){
                    System.out.print("");

}
            
                    for(int index= count; index <name.length(); index++){
                    System.out.print(name.charAt(index));

}
System.out.println();   
            } 


               for(int count =name.length(); count >=1; count--){

            for(int space =1; space <= count; space++){
                    System.out.print(" ");

}
            
            for(int index=count; index >=0; index--){
                    System.out.print(name.charAt(index));

}
System.out.println();   
            } 
         }
    }


