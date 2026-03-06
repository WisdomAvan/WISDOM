public class PopulationVariance{

    public static int getTheAdditionOfNumbersOfAnArray(int []scoreOfStudents){

        int sumOfScores =0;

        for(int score : scoreOfStudents){
        
            sumOfScores += score;        

        }
        return sumOfScores;   
 }

    public static double getTheAverageOfNumbersOfAnArray(int [] scoreOfStudents){

        
            double sumOfScores = (double)getTheAdditionOfNumbersOfAnArray(scoreOfStudents);

            double average = sumOfScores/scoreOfStudents.length;
        return Double.valueOf(String.format("%.2f", average));

    
    }
    
    public static double getTheSumOfSquaredDifferenceOfAnArray(int [] scoreOfStudents){

            double summationOfNumbers =0;

        for(int score : scoreOfStudents){

            double sumOfNumbers = score - getTheAverageOfNumbersOfAnArray(scoreOfStudents);

                summationOfNumbers += (sumOfNumbers * sumOfNumbers);

        }
        return summationOfNumbers;
    }

    public static double getTheVarainceOfAnArray(int [] scoreOfStudents){

    double varianceOfAnArray = getTheSumOfSquaredDifferenceOfAnArray(scoreOfStudents)/scoreOfStudents.length;

    return Double.valueOf(String.format("%.2f",varianceOfAnArray));

    }

    public static double getTheSquareRootOfANumber(double number){

        double squareNumber =0.0;
        double count=0.0;

        for(;squareNumber < number ; ){

              squareNumber += (count * count);  
                    count++;
          }
              if ((count * count) != number){

                    int counter =1;

                for(; counter <= 3 && count <= number; ){
               
                    count =0.5 * (count + (number / count));
                        counter++;
               
              }            
                    String stringCount = String.format("%.2f", count);
                    return Double.valueOf(stringCount);
            }
             return Double.valueOf(String.format("%.2f", count));   
        }

      public static double getTheStandardDeviation(int [] scoreOfStudents){

        double variancevalue = getTheVarainceOfAnArray(scoreOfStudents);

            double ValueOfStandardDeviation = getTheSquareRootOfANumber(variancevalue);
         return ValueOfStandardDeviation;
        }  
        
}
