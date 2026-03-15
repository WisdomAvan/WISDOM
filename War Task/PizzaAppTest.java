import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class PizzaAppTest{

    @Test
    public void testForTheNumberOfBoxes(){

        int numberOfPeople = 10;

        int numberOfSlices =4;

        int actual =PizzaApp.getTheNumberOfBoxes(numberOfPeople , numberOfSlices);

        int expected = 3;

    assertEquals(expected, actual);


    }

    @Test
    public void testForTheRemainder(){
    
    int numberOfPeople = 10;

        int numberOfSlices =4;

        int actual =PizzaApp.getTheRemainingLeftOverSlice(numberOfPeople , numberOfSlices);

        int expected = 2;

    assertEquals(expected, actual);        

    }

    @Test
    public void testForThePrice(){
    
        int numberOfPeople = 10;

        int numberOfSlices =4;

        double price = 2000;

        double actual =PizzaApp.getTheTotalPriceOfPizza(numberOfPeople, numberOfSlices, price);

        double expected = 6000;

    assertEquals(expected, actual);  

    }



}
