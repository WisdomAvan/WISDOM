import java.util.Scanner;

public class Task11{

    public static void main(String [] args){
        
            String result="";

        Scanner obtain = new Scanner(System.in);

            System.out.print("Enter Any Words");
            
            String word = obtain.nextLine();

            String originalWord = word;

    for(int count = word.length()-1; count >=0; count--){

        
           result += word.charAt(count);

        }

            if(originalWord.equals(result)){
            
            System.out.println("This Is a Panlindrome");

}else{
    
    System.out.println("This Is Not Panlindrome");

}

    }

} 
