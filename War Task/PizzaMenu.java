import java.util.Scanner;

public class PizzaMenu{

    public static void pizzaMenuMethod(){
        Scanner obtain = new Scanner(System.in);   
     
        String pizzaMenu ="""

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
                 """;

                 System.out.println(pizzaMenu);   

            System.out.println("Enter Type Of Pizza: ");
                
                String pizzaType = obtain.nextLine();

            System.out.println("How Many People Wants To Eat Pizza?:  ");
                
                int numberOfPersons = obtain.nextInt();                
                
            switch (pizzaType){
    
                            case "sapa size"->{

                            System.out.println("Sapa Size");

                            int numberOfSlicess = 4;
                            double priceOfPizza = 2000;

                            int numberOfBoxes =PizzaApp.getTheNumberOfBoxes( numberOfPersons, numberOfSlicess);

                            int leftOverSlice =PizzaApp.getTheRemainingLeftOverSlice(numberOfPersons,numberOfSlicess );

                            double totalPrice =PizzaApp.getTheTotalPriceOfPizza(numberOfPersons,numberOfSlicess,priceOfPizza);

                            System.out.printf("Number of boxes needed: %d\nRemaining slices: %d\nTotal price: ₦%,.2f\n", numberOfBoxes, leftOverSlice, totalPrice);   

                       }

                            case "small money"->{

                               System.out.print("Small Money");
                               int numberOfSlices = 6;  
                                double priceOfPizza = 2400;

                            int numberOfBoxes =PizzaApp.getTheNumberOfBoxes(numberOfPersons, numberOfSlices);

                            int leftOverSlice =PizzaApp.getTheRemainingLeftOverSlice(numberOfPersons,numberOfSlices );

                            double totalPrice =PizzaApp.getTheTotalPriceOfPizza(numberOfPersons,numberOfSlices,priceOfPizza);
                            
                            System.out.printf("Number of boxes needed: %d\nRemaining slices: %d\nTotal price: ₦%,.2f\n", numberOfBoxes, leftOverSlice, totalPrice);
                        }
                            case "big boys"->{

                               System.out.print("Big Boys");
                                int numberOfSlices = 8;
                                double priceOfPizza = 3000;
                                
                            int numberOfBoxes =PizzaApp.getTheNumberOfBoxes( numberOfPersons, numberOfSlices);

                            int leftOverSlice =PizzaApp.getTheRemainingLeftOverSlice(numberOfPersons,numberOfSlices );

                            double totalPrice =PizzaApp.getTheTotalPriceOfPizza(numberOfPersons,numberOfSlices,priceOfPizza);
                            System.out.printf("Number of boxes needed: %d\nRemaining slices: %d\nTotal price: ₦%,.2f\n", numberOfBoxes, leftOverSlice, totalPrice);
                        }

                            case "odugwu"->{

                                System.out.print("Odugwu");
                                int numberOfSlices = 12;
                                double priceOfPizza = 4200;

                                int numberOfBoxes =PizzaApp.getTheNumberOfBoxes( numberOfPersons, numberOfSlices);

                                int leftOverSlice =PizzaApp.getTheRemainingLeftOverSlice(numberOfPersons,numberOfSlices );

                                double totalPrice =PizzaApp.getTheTotalPriceOfPizza(numberOfPersons,numberOfSlices,priceOfPizza);
                                System.out.printf("Number of boxes needed: %d\nRemaining slices: %d\nTotal price: ₦%,.2f\n", numberOfBoxes, leftOverSlice, totalPrice);
                        
                           }

                    }

               }

 }
