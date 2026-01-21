import java.util.Scanner;


public class PizzaWahala{

    public static void main (String [ ] args){

    Scanner obtain = new Scanner (System.in);
String pizzaDashboard = ("""

        WELCOME TO IYA SCAMBIRAH PIZZA JOINT
__________________________________________________________
|                   |                   |                |
|  Pizza Size       | Number Of Slices  | Price Per Box  |
|___________________|___________________|________________|
|                   |                   |                |
| Sapa Size         |      4            |  #2,000.00     |
|___________________|___________________|________________|
|                   |                   |                |
| Small Money       |      6            |  #2,400.00     |
|___________________|___________________|________________|
|                   |                   |                |
| Big Boys          |      8            |  #3,000.00     |
|___________________|___________________|________________|
|                   |                   |                |
| Odugwu            |      12           |  #4,200.00     |
|___________________|___________________|________________|
    """);

System.out.println(pizzaDashboard);

System.out.print("KINDLY, ENTER THE TYPE OF PIZZA: ");
String pizzaMenu = obtain.nextLine().toUpperCase();

System.out.print("KINDLY, ENTER THE NUMBER OF PEOPLE : ");
int numberOfPeople= obtain.nextInt();


switch (pizzaMenu){

        case "SAPA SIZE"->{
               
              String pizzaName = ("SAPA SIZE");

              int numberOfSlices = 4;

              double priceOfPizza = 2000;

               }

        case "SMALL MONEY"->{
               
              String pizzaName = ("SMALL MONEY");

              int numberOfSlices = 6;

              double priceOfPizza = 2,400;

                      }

        case "BIG BOYS"->{
               
              String pizzaName = ("BIG BOYS");

              int numberOfSlices = 8;

              double priceOfPizza = 3000;

                }

        case "ODUGWU"->{
               
              String pizzaName = ("ODUGWU");

              int numberOfSlices = 12;

              double priceOfPizza = 4200;

             }



        }// switch brace
    }

}
