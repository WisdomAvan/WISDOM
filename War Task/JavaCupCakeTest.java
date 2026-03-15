import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;




public class JavaCupCakeTest{


    @Test
    public void testTheFunction(){

    int [] input ={2,5,7,1,6,9}; 

    String [] actual =JavaCupCake.getThePredicateFunction(input);

    String [] expected = {"True","False", "False", "False", "True", "False"};

    assertArrayEquals(expected ,actual);

    }

}
