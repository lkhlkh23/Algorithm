package Q3053;

import java.io.*;
import java.util.*;
public class Main {
   static final int ROUND_STANDARD = 6; 
   public static void main(String[] args) throws NumberFormatException, IOException {
      Scanner sc = new Scanner(System.in);
      
      int input = sc.nextInt();
      sc.close();
      
      System.out.printf("%f \n", getEuclidean(input));
      System.out.printf("%f \n", getTaxi(input));
      
   }
   
   public static double getEuclidean(int n) {
      return Math.round(n * n * Math.PI * Math.pow(10, ROUND_STANDARD)) / Math.pow(10, ROUND_STANDARD);
   }
   
   public static double getTaxi(int n) {
      return Math.round(2 * n * n * Math.pow(10, ROUND_STANDARD)) / Math.pow(10, ROUND_STANDARD);
   }

}