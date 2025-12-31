public class DivisibleBy3{
    public static void main (String [] args){

int count =1;
int total =0;
    for(count =1; count <=30; count++){

    if(count%3 == 0){
        System.out.println(count);
            }

        total+=count;
        
                }    
    System.out.println("The Total Sum Of Multiples Of 3 Is: " + total);



    }

}
