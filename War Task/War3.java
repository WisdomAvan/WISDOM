public class War3{

    public static String [] getTheVowelsAndContsonant(String [] word){
                int vowels =0;
                int consonant=0;
        for(int index =0; index < word.length; index++){

            char letter = word.charAt(count);
            
            if(letter == 'a' || letter == 'o' || letter == 'i' || letter == 'e' letter == 'u'){

                vowels++;      
          }      
            return vowels;
                
        }
            else{
                return consonant;
                
        }
    }
        
}
