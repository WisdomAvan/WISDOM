public class JavaCupCake2{
        
    public static void getTheDoubleArrayNumber(int [] input){

        for(int count =0; count < input.length; count++){

            int [] result =input[count *2];
        }

        System.out.printf("%d,%d",input,result);
    }
    
    public static void main(String [] args){

            int [] input ={2,6,7,1,5};

            getTheDoubleArrayNumber(input);            
        
            System.out.printf("%d,%d",input,result);
    }

}
