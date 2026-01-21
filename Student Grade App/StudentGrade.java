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

                        int [][] studentRecords = new int [numberOfStudent][numberOfSubject];

