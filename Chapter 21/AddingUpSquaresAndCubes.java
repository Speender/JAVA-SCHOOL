/*This program calculates teh sum of squares given by the user
Name: Ramie Theofil D. Pondar
Date: 03/25/24*/
import java.util.*;

public class AddingUpSquaresAndCubes{
   public static void main (String[]args){
      Scanner scan = new Scanner (System.in);
      //declarations
      int i = 0, sumSq = 0, sumCube = 0;
      double n, totalSq = 0, totalCube = 0;;
      
      //input
      System.out.println("Upper Limit: ");
      n = scan.nextDouble();
      
      //process
      while (i < n){
         sumSq += Math.pow(i , 2);
         sumCube += Math.pow (i , 3);
         i++;
      }
         totalSq = n * (n + 1 )* (2 * n + 1) / 6;
         totalCube = Math.pow (n , 2) * Math.pow ( (n + 1) , 2 ) / 4;
         
         //output
         System.out.printf("The sum of Squares: %.0f \nThe sum of Cubes: %.0f", totalSq, totalCube);
   }
}