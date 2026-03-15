import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;



public class War2Test{

    @Test
    public void testTheDegree(){
    
        int value = 2;

        int actual = War2.getTheFarahrit(value);

        int expected = 32;

        assertEquals( expected , actual);






    }

}
