import java.util.Scanner;
import java.util.ArrayList;

public class StudentGradeApp{

    public static void main(String []args){

        Scanner obtain = new Scanner(System.in);

        ArrayList < String []> studentNameAndSubjectsLog = new ArrayList<>();
   
                int totalScore =0;

                int index =0;
                
                int count =0;
            System.out.print("ENTER THE NUMBER OF STUDENTS WHO WROTE THE EXAM/TEST: ");
              int numberOfStudent = obtain.nextInt();
            
            System.out.print("ENTER THE NUMBER OF SUBJECTS OFFERED: ");
                int numberOfSubject = obtain.nextInt();
        while(true){


            String studentGradeDetails = ("""

                      1. STUDENT NAME & SCORE 
            
                      2. STUDENT CALCULATION AND POSITION

                      3. Students Exam Record
                      
                      4. Student  Summary Records

                      5. Exit
                          """);

                System.out.printf("%s\n",studentGradeDetails);

        System.out.print("ENTER THE MENU BY PRESS ANY NUMBER FROM 1 - 5 ");
          int studentGradeOption = obtain.nextInt();
            obtain.nextLine();
        
        switch(studentGradeOption){
            
            case 1->{
                for(count = 0; count < numberOfStudent; count++){

                    count =0;
                       String [] studentrecord = new String [numberOfSubject + 1];

                          System.out.print("Enter The Name Of The Student: ");
                            String nameOfStudent = obtain.nextLine();

                while(count != numberOfSubject ){
                     System.out.print("Enter The Subject Score; ");
                        String nameOfSubject = obtain.nextLine();
                            
                                 count++;
                      }  
                         studentNameAndSubjectsLog.add(studentrecord);  
                }

                  
            }// case 1 brace 


            case 2->{
                       for(String [] studentdetails : studentNameAndSubjectsLog){ 
                            index =0;

                            for(index = 0; index < studentdetails.length; index++){
                                totalScore = Double.parsedouble(studentdetials[index])
                            }

                                    double averageScore = (double) (totalScore / numberOfSubject);
                               
                            }

                     }// case 2 brace 

//            case 3->{ 
//                      
//

            }//switch brace
    
        }// overall while for all cases


       }

}
