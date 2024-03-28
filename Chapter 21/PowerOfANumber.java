/*This program calculates the power value of x using the Math.pow method
Name: Ramie Theofil D. Pondar
Date: 03/26/24*/
import java.util.*;

public class PowerOfANumber{
   public static void main(String[]args){
      Scanner scan = new Scanner (System.in);
      //declarations
      int i = 0;
      double x, n, total = 0;
      //input
      System.out.println("Enter X: ");
      x = scan.nextDouble();
      System.out.println("Enter N: ");
      n = scan.nextDouble();
      //process and output
      if (n < 0){
         System.out.println("N must be a positive integer.");
      } else {
         total = Math.pow(x , n);
         System.out.printf("%.2f raised to the power %.0f is: %.5f", x, n, total);
      }
      
  }
}