public class SingleRightAsterisks{
    
    public static void main(String [] args){

        int pat = 5;

        for(int count=1; count <=pat; count++){


            for(int space =count; space >=1; space-- ){
                System.out.print(" ");    
        }
                  
            
            for(int index =count; index <=pat; index++){

                System.out.print("*");

            }
                System.out.println();
        }
    }

}
