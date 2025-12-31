import java.util.Scanner;

public class CardValidatortest {

    public static void main(String[] args) {

        Scanner obtain = new Scanner(System.in);
        System.out.print("Slot In Your Card: ");
        String digits = obtain.nextLine();

                  

        CardValidator.cardType(digits);
        CardValidator. digitsPrint(digits);
        CardValidator.digitLength (digits);
        CardValidator.digitsValidator(digits);
        
        
    }
}

