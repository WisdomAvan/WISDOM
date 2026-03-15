public class ReversedNumber{

    
    public static void main(String [ ] args){

            int [] numbersOfScores = {2,4,7,8,5};
    
            int reversedNumber=0;
            int numbers =0;

       for(int index =0; index < numbersOfScores.length-1; index++){     
            int digits = numbersOfScores % 10;
            
             reversedNumber = reversedNumber * 10 + digits;
                
                numbers/=10;
        }
            System.out.print("The resversed number is: " + reversedNumber);
    }

}
