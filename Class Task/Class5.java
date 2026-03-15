import java.util.Scanner;

public class Class5{

    public static void main(String [] args){

        Scanner obtain = new Scanner(System.in);

            System.out.print("Enter Number");

               int number = obtain.nextInt();
                
        for(int count =1; count <=number; count++){

            for(int space =1; space <=count; space++){
            
                System.out.print(" ");
           
             }
                 
                for(int index =count; index <=number; index++){
                    System.out.print("5"+"");
            }
                for(int index =number-1; index >=count; index--){
                    System.out.print("5");
            }



                System.out.println();        
       }
        
        for(int count =1; count <=number; count++){

            for(int space =number; space >=count; space--){
            
                System.out.print(" ");
           
             }
                 
                for(int index =1; index <=2*count-1; index++){
                    System.out.print(index);
            }
//                for(int index =number-1; index >=count; index--){
//                    System.out.print(index);
//            }

                System.out.println();        
       }
            for(int count =1; count <=number; count++){

            for(int space =number; space >=count; space--){
            
                System.out.print("");
           
             }
                 
                for(int index =1; index <=count; index++){
                    System.out.print(index);
            }
//                for(int index =number-1; index >=count; index--){
//                    System.out.print(index);
//            }

                System.out.println();        
       }
    
    }// method brace

}
