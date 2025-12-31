
public class Panlidrome {


public static void checkPanlidrome(int number){


    int testNumber = number;
    int reversedNumber = 0;
    
    while (number!=0){

    int value =  number % 10;
    reversedNumber = reversedNumber * 10 + value;
    number = number / 10;

                }

        if(reversedNumber == testNumber){
            System.out.println("The Number Is A Panlindrome\n");
                }
        else{
            System.out.println("This Number Is Not A Panlindrome\n");
            
            }


    }

}
