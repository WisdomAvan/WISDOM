import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class VarianceTest{


    @Test

    public void checkForTheAdditionOfNumber(){

        int [] scoreOfStudents = {2,5,3};
        
        int actual = PopulationVariance.getTheAdditionOfNumbersOfAnArray(scoreOfStudents);
        int expected =10;

    assertEquals(actual,expected);

    }


    @Test
    public void checkForTheAverageOfNumbers(){

        int [] scoreOfStudents = {2,5,3};
        double actualAverage = PopulationVariance.getTheAverageOfNumbersOfAnArray(scoreOfStudents);
        double expectedAverage = 3.33;

    assertEquals(actualAverage,expectedAverage);    

    }


    @Test
    public void checkForTheSumOfASquareDifferenceOfNumbers(){

        int [] scoreOfStudents = {2,5,3};

        double actualSumOfASquaredDifference= PopulationVariance.getTheSumOfSquaredDifferenceOfAnArray(scoreOfStudents);
        
        double expectedSumOfASquaredDifference = 4.67;

    assertEquals(actualSumOfASquaredDifference,expectedSumOfASquaredDifference,0.01);

    }


    @Test
    public void checkForTheVarianceOfAnArray(){

        int [] scoreOfStudents = {2,5,3};

        double actaulOfVariance = PopulationVariance.getTheVarainceOfAnArray(scoreOfStudents)/scoreOfStudents.length;
        
        double expectedVariance = 0.52;
        
    assertEquals(expectedVariance, actaulOfVariance);


    }
    
    @Test
    public void testForSquareRoot(){
        
        int number = 9;
        
        double actualValue = PopulationVariance.getTheSquareRootOfANumber(number);
        
        double expectedValue =3;

        assertEquals(expectedValue , actualValue);
    }

    @Test
    public void testForTheStandardDeviationOfAnArray(){
    
        int [] scoreOfStudents = {2,5,3};

        double actualStandardDeviation =PopulationVariance.getTheSquareRootOfANumber(PopulationVariance.getTheVarainceOfAnArray(scoreOfStudents));
        
        double expectedStandardDeviation = 3.0;

        assertEquals(actualStandardDeviation ,expectedStandardDeviation,0.01);

     }

}



