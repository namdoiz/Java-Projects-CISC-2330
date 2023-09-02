import java.util.Scanner;

public class HealthChart{
   public static void main(String[] args){
      Scanner scnr = new Scanner(System.in);
      double bmi;
      
      System.out.println("Welcome to BMI calculator! Please enter your first name: \n");
      String user_name = scnr.next();
      
      System.out.println("Great! Now please enter your age: \n");
      int age = scnr.nextInt();
      
      System.out.println("Please enter your weight in pounds: \n");
      double weight = scnr.nextFloat();
      
      System.out.println("Nice! Now please enter your height, starting with feet first and then inches.\n");
      System.out.println("Feet: \n");
      int height_in_feet = scnr.nextInt();
      System.out.println("Inches: \n");
      int height_in_inches = scnr.nextInt();
      
      bmi = (weight * 0.45359237) / (((height_in_feet * 0.3048) + (height_in_inches * 0.0254)) * ((height_in_feet * 0.3048) + (height_in_inches * 0.0254)));
      System.out.print(user_name + " you have a BMI value of ");
      System.out.printf("%.3f\n", bmi);
   }
 }