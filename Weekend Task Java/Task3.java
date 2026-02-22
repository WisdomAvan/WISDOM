import java.util.Scanner;

public class Task3{

    public static void main(String [] args){
        int counter=0;
        int total=0;
        Scanner obtain = new Scanner(System.in);

            System.out.print("Enter a String");

            String word = obtain.nextLine();

        for(int count =0; count < word.length(); count++){

            char alphabet = word.charAt(count);

               if( Character.isUpperCase(alphabet)){
                        counter++;

                  

            
}


        }

System.out.println(counter);




        }


}
