public class Task17{

    public static void main(String [] args){

            int total =0;
           
        for(int count=0; count <=100; count++){

                 int value =0;
                 
            for(int counter =1; counter <=count; counter++){

                  if (count % counter ==0){

                          value++;

          }
                
   }
       if(value ==2){
                total++;
            


} 
    }

System.out.printf("%d\n", total);
 }


}
