import java.io.*;
import java.util.Scanner;
public class ArrayStatsBasic{
   public static void main(String[] args)throws IOException{
      FileInputStream fileIS = new FileInputStream("input.txt");
      Scanner scnr = new Scanner(fileIS);
      
      double[] arr = new double[10];
      int i = 0;
      
      double num;
      double min;
      double max;
      double count = 0;
      double sum = 0;
      double avg;
      
      while(scnr.hasNextFloat()){
         num = scnr.nextDouble();
         arr[i] = num;
         i+=1;
         count += 1;
         sum += num;
      }
      
      min = arr[0];
      max = arr[0];
      for(i = 0; i<arr.length; i++){
         if (min > arr[i]){
            min = arr[i];
         }
         if (max < arr[i]){
            max = arr[i];
         }
      }
      
      avg = sum / count;
      
      System.out.printf("min = %.2f\n", min);
      System.out.printf("max = %.2f\n", max);
      System.out.printf("mean = %.2f\n", avg);
      
   }
}