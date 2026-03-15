public class PizzaApp{

    public static int getTheNumberOfBoxes(int numberOfPersons, int numberOfSlice){

        int numberOfBoxes = (int)(Math.ceil((double)numberOfPersons/numberOfSlice));      

        return numberOfBoxes;
    }

    public static int getTheRemainingLeftOverSlice(int numberOfPersons,int numberOfSlice ){

        int  numberOfBoxes = getTheNumberOfBoxes(numberOfPersons,numberOfSlice ) ;

        int numberOfSliceRemaining =  (numberOfBoxes * numberOfSlice) - numberOfPersons;

        return numberOfSliceRemaining;

    }
    
    public static double getTheTotalPriceOfPizza(int numberOfPersons,int numberOfSlice,double priceOfPizza){

         double numberOfBoxes= (double)(getTheNumberOfBoxes(numberOfPersons,numberOfSlice)); 

            double amountOfPizza = numberOfBoxes * priceOfPizza;

        return  amountOfPizza;
    }
}
