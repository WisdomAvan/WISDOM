import java.util.Scanner;

public class Class3{

    public static void main(String [] args){
    
        Scanner obtain = new Scanner(System.in);
    
            System.out.print("Enter Number");

                int number = obtain.nextInt();

            for(int count =number; count >=1; count--){

                    
//            for(int index = count; index <=number; index++){
//                
//                System.out.print(" ");
//        }

            for(int counter =count; counter >= 1; counter--){

                System.out.print(counter + " ");
        }
             System.out.println();
}


           

    }

}
