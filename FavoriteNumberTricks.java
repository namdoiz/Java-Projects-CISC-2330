import java.util.Scanner;
public class FavoriteNumberTricks{
   public static void main(String[] args){
   
      Scanner scnr = new Scanner(System.in);
      int favrit_num;
      
      System.out.print("What is your favorite number? ");
      
      favrit_num = scnr.nextInt();
      
      System.out.print("Your favorite number is ");
      System.out.println(favrit_num);
      
      System.out.print("Your favorite number doubled is ");
      System.out.println(favrit_num * 2);
      
      System.out.print("Your favorite number squared is ");
      System.out.println(favrit_num * favrit_num);
      
      System.out.print("The negative of your favorite number is ");
      System.out.println(-favrit_num);
      
      System.out.print("The inverse of your favorite number is ");
      System.out.printf("%.3f\n", 1.0 / favrit_num);
      
   }
}