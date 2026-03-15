public class SingleLeftAsterisks{
    
    public static void main(String [] args){

        int pat = 5;

        for(int count=1; count <=pat; count++){


            for(int space =pat; space >=count; space-- ){
                System.out.print("");    
        }
                  
            
            for(int index =count; index >=1; index-- ){

                System.out.print("*");

            }
                System.out.println();
        }
    }

}
