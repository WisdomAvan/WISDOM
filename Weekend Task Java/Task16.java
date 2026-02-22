public class Task16{

    public static void main(String [] args){

            
           
        for(int count=0; count <=100; count++){

                 int value =0;

            for(int counter =1; counter <=count; counter++){

                  if (count % counter ==0){

                          value++;

          }
                
   }
       if(value ==2){

            System.out.printf("%d\n", count);


} 
    }


 }


}
