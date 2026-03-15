public class JavaCupCake{
        
        public static String [] getThePredicateFunction(int [] input){
            String [] result = new String [input.length];

        for(int index =0; index < input.length; index++){
            
            if (input[index] % 2 ==0 ){
                
               result[index] = "True";

             }          else

                 result[index] = "False";
                         
       } 
         
        return result;
    }

//    public static void main(String [] args){
//
//        int [] input = {2,5,7,1,6,9};
//
//           getTheFunction(input); 
//
//       
//      }
}









