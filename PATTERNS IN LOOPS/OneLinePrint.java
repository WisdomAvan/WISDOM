public class OneLinePrint{
    
    public static void main(String [] args){

        int pat = 10;

        for(int count=1; count <=pat; count++){


            for(int space =pat; space >=count; space-- ){
                System.out.print("*" + " ");    
        }
                  System.out.print("   ");  
            
            for(int index =1; index <=count; index++){

                System.out.print("*" +" ");

            }

            System.out.print("");

            for(int spacious =1; spacious <=count; spacious++){

                System.out.print("*"+ " ");

            }
                System.out.print("   ");
                
                for(int index =count; index <=pat; index++){

                System.out.print("*" + " ");

            }
                System.out.println();
        }
    }

}
