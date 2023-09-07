import java.util.*;
import java.io.*;

public class MaxMin{
   public static void main(String[] args) throws FileNotFoundException{
      //This line allows reading a file called input.txt
      //Make sure you have input.txt in the same directory as the .java file
      Scanner fileIn = new Scanner(new File("input.txt"));
      
      int x = fileIn.nextInt();
      int y = fileIn.nextInt();
      int z = fileIn.nextInt();
      int max = 0;
      int min = 0;
      
      if (x == y && y == z){
         System.out.println("The max value is " + x);
         System.out.println("The min value is " + x);
      }
      else if (x == y || x == z || y == z || z == y){
      
         if (x == y || y == x){
            if (y > z){
               System.out.println("The max value is " + y);
               System.out.println("The min value is " + z);
            }
            else{
               System.out.println("The max value is " + z);
               System.out.println("The min value is " + y);
            }
         }
         
         else if (x == z || z == x){
            if (z > y){
               System.out.println("The max value is " + z);
               System.out.println("The min value is " + y);
            }
            else{
               System.out.println("The max value is " + y);
               System.out.println("The min value is " + z);
            }
         }
      
         
         else if (y == z || z == y){
            if (z > x){
               System.out.println("The max value is " + z);
               System.out.println("The min value is " + x);
            }
            else{
               System.out.println("The max value is " + x);
               System.out.println("The min value is " + z);
            }
         }
      }   
                 
   
      
      if (x != y && y != z && z != x){
      
      
      
         if (x > y){
            if (y > z){
               max = x;
               min = z;
            }
         }
         if (x > z){
            if (z > y){
               max = x;
               min = y;
            }
         }
         if (y > x){
            if (x > z){
               max = y;
               min = z;
            }
         }
         if (y > z){
            if (z > x){
               max = y;
               min = x;
            }
         }
         if (z > x){
            if (x > y){
               max = z;
               min = y;
            }
         }
         if (z > y){
            if (y > x){
               max = z;
               min = x;
            }
         }
         System.out.println("The max value is " + max);
         System.out.println("The min value is " + min);
      }
      
      
      
      //This line is to show you the numbers if you wish to uncomment it out.
      //System.out.println("x = "+x+" y = "+y+" z = "+z);
      }
   }



