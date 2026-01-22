import java.util.Scanner;
import java.util.Random;

public class TaskOne{

    public static void main(String []args){

        Scanner obtain = new Scanner(System.in);
            int numberguessing=0;
          Random random = new Random();

            for(int count=1; count <= 10; count++){

                    numberguessing = random.nextInt(10)+1;
                    System.out.printf("%d\n",numberguessing);
              }
                



    }

}
