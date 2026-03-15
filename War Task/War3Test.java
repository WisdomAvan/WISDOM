import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class War3Test{

    @Test
    public void testTheWord(){

        String [] word = {"wisdom"};

        String [] actual =War3.getTheVowelsAndContsonant(word);

        String [] expected = {2, 4};

        assertArrayEquals(expected , actual);

    }

}
