import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;

public class CourseGrade {
   public static void main(String[] args) throws IOException {
      Scanner scnr = new Scanner(System.in);
      PrintWriter new_file_line = null;
      Scanner file_line_scanner = null;
      /* TODO: Declare any necessary variables here. */
      String file_line;
      String file_name = scnr.next();
      String student_firstname;
      String student_lastname;
      int grade1;
      int grade2;
      int grade3;
      double average;
      String letter_grade;
      int grade1_sum = 0;
      int grade1_count = 0;
      int grade2_sum = 0;
      int grade2_count = 0;
      int grade3_sum = 0;
      int grade3_count = 0;
      double class_grade1_avg;
      double class_grade2_avg;
      double class_grade3_avg;
      FileInputStream input_file = new FileInputStream(file_name);
      FileOutputStream output_file = new FileOutputStream("report.txt");
      new_file_line = new PrintWriter(output_file);
      Scanner file_scanner = new Scanner(input_file);
      while (file_scanner.hasNext()){
         file_line = file_scanner.nextLine();
         file_line_scanner = new Scanner(file_line);
         student_firstname = file_line_scanner.next();
         student_lastname = file_line_scanner.next();
         grade1 = file_line_scanner.nextInt();
         grade1_sum += grade1;
         grade1_count += 1;
         grade2 = file_line_scanner.nextInt();
         grade2_sum += grade2;
         grade2_count += 1;
         grade3 = file_line_scanner.nextInt();
         grade3_sum += grade3;
         grade3_count += 1;
         average = (grade1 + grade2 + grade3) / 3.0;
         
         if(average >= 90){
            letter_grade = "A";  
         }
         else if(average >=80){
            letter_grade = "B";  
         }
         else if(average >= 70){
            letter_grade = "C";  
         }
         else if(average >= 60){
            letter_grade = "D";  
         }
         else{
            letter_grade = "F";  
         }
         new_file_line.println(student_firstname + "\t" + student_lastname + "\t" + grade1 + "\t" + grade2 + "\t" + grade3 + "\t" + letter_grade);

      }
      class_grade1_avg = grade1_sum /  (grade1_count * 1.0);
      class_grade2_avg = grade2_sum /  (grade2_count * 1.0);
      class_grade3_avg = grade3_sum /  (grade3_count * 1.0);
      new_file_line.println();
      new_file_line.print("Averages: Midterm1 ");
      new_file_line.printf("%.2f", class_grade1_avg);
      new_file_line.print(", Midterm2 ");
      new_file_line.printf("%.2f", class_grade2_avg);
      new_file_line.print(", Final ");
      new_file_line.printf("%.2f\n", class_grade3_avg);
      new_file_line.close();
      
      
      
      
      /* TODO: Read a file name from the user and read the tsv file here. */
      
      
      /* TODO: Compute student grades and exam averages, then output results to a text file here. */
      
   }
}