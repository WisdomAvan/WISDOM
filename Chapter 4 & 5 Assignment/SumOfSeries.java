public class SumOfSeries{
    public static void main (String [] args){
    
    long number =1;
    long total =0;
    long product = 1;

    for(number = 1; number <= 100; number++){

        total+=number;
        product*=number;
        System.out.println(number);
        }
        
        System.out.println("The sum: \n" + total + "The Product: \n" + product);
    }

}
