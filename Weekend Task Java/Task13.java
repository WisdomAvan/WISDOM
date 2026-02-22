import java.util.Scanner;

public class Task13{


    public static void main(String [] args){
        
        Scanner obtain = new Scanner(System.in);
            int counter =0;
        System.out.print("Enter a sentences: ");

            String sentence = obtain.nextLine();

for(int count =0; count < sentence.length(); count++){

        if (sentence.charAt(count)==' '){
            
                counter++;
    }


}

if (sentence.length() > 0){
    counter++;

}

System.out.println(+ counter);





        }




}
