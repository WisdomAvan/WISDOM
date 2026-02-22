import java.util.Scanner;

public class Task9{

    public static void main(String [] args){
            int value =0;
        Scanner obtain = new Scanner(System.in);

            System.out.print("Enter Number");

                int integer = obtain.nextInt();

        for(int count =1; count <=100; count++){

            if( count % integer == 0){
           
                value++;


       }


}

        System.out.println(value);




    }


}
