import java.util.Scanner;

public class VowelAndConstant{

    public static void main(String [] args){

        Scanner obtain = new Scanner(System.in);
        
            System.out.println("Enter String ");
    
                String word = obtain.nextLine().toUpperCase();
                    int vowels=0;
                    char letter=0;
                    int consonants=0;
        for(int count =0; count < word.length(); count++){
        
             letter = word.charAt(count);
            if(letter == 'A'|| letter == 'E' || letter == 'O' || letter == 'I' || letter == 'U'){
                    vowels++;
            
           }else{
                    consonants++;
        }
        }
                        System.out.printf("The Number of vowel is: %d\n", vowels);
                            
                        System.out.printf("The Number Of Consonants is: %d\n", consonants);
    
    }

}
