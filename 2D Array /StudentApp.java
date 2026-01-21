import java.util.Scanner;
public class StudentApp{

    public static void main(String [] args){
        
        Scanner obtain = new Scanner(System.in);
                    
                    int count = 0;                
                    int counter =0;
                    
                System.out.print("ENTER THE NUMBER OF STUDENTS IN THE CLASS: ");
                    int numberOfStudent = obtain.nextInt();
                        
                        
                    System.out.print("ENTER THE NUMBER OF SUBJECT OFFERED: ");
                      int numberOfSubject = obtain.nextInt();
                         
                        int [][] studentRecords = new int [numberOfStudent][numberOfSubject + 2];

                     for(counter = 0; counter < numberOfStudent; counter++){
                             System.out.println("ENTER THE SCORE OF STUDENT "+ (counter +1) + ": ");
                                                
                                
                                for(count = 0; count < numberOfSubject; count++){
                                    System.out.print("ENTER THE SCORE OF SUBJECT OFFERED RESPECTIVILY  "+ (count + 1) +":");
                                        int studentScore = obtain.nextInt();
                                                
                                            studentRecords[counter][count]=studentScore;

                                                if(studentScore < 0 || studentScore > 100){
                                                    System.out.print("PLEASE ENTER THE CORRECT SCORE!!!");
                                                    
                                    }

                                        
                            }
                                     
                       }


                        for(int row =0; row < studentRecords.length; row++){
                                         int totalScore = 0;
                                         double averageScore = 0;
                            for(int col = 0; col < studentRecords[row].length; col++){
                               
                                totalScore += studentRecords[row][col];
                                            
                                      System.out.print(studentRecords[numberOfStudent][numberOfSubject+1]+ "\t"); 
                                                    
                                    } 
                                      studentRecords[row][numberOfSubject+1] = totalScore;
                                         
                                          
                                      System.out.println();  
                                 }
//                                     averageScore = (double)(totalScore/numberOfSubject);
//
//                                    studentRecords[row]=averageScore;
//
                                            
                          



//                        for(int row =0; row < studentRecords.length; row++){
//                                         int totalScore = 0;
//                                         double averageScore = 0;
//                            for(int col = 0; col < studentRecords[row].length; col++){
//                               
//                                totalScore += studentRecords[row][col];
//                                            
//                                      
//                                        System.out.print(studentRecords[row][col]+ "\t");                
//                                  
                          
//                                     averageScore = (double)(totalScore/numberOfSubject);
//
//                                    studentRecords[row]=averageScore;
//
  
//                                          System.out.println();


}
}
