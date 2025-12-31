public class CardValidator{

    public static void cardType(String digits){

        if (digits.startsWith("4")) {
            System.out.println("**Credit Card Type: Visa Card");
        } else if (digits.startsWith("5")) {
            System.out.println("**Credit Card Type: MasterCard");
        } else if (digits.startsWith("37")) {
            System.out.println("**Credit Card Type: American Express Card");
        } 
          else if (digits.startsWith("6")) {
            System.out.println("**Credit Card Type: Discover Card");
        }else {
            System.out.println("**Credit Card Type: Invalid Card");
        }

    }




    public static void digitLength (String digits){

        if (digits.length() < 13 || digits.length() > 16) {
            System.out.println("**Credit Card Digit Length: " + digits.length());
        } else {
            System.out.println("**Credit Card Digit Length: " + digits.length());
        }

}


    public static void digitsValidator(String digits){ 
    
         int total = 0;
        for (int count = digits.length() - 1; count >= 0; count--) {

            int number = Character.getNumericValue(digits.charAt(count));

            if (count % 2 == 0) {
                number *= 2;
                if (number > 9) {
                    number -= 9;
                }
            }

            total += number;
        }

       
        if (total % 10 == 0) {
            System.out.println("**Credit Card Validity Status: Valid");
        } else {
            System.out.println("**Credit Card Validity Status: Invalid");
        
        }

      
  } 


    public static void digitsPrint(String digits){
    System.out.println("**Credit Card Number: " + digits);



    }

}

