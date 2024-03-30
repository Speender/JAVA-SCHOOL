/*This program recceives the value start and end and prints the number in between that value inclusively
Name: Ramie Theofil D. Pondar
Date: 03/25/24 */
import java.util.*;

public class RunOfIntegers{
   public static void main(String[]args){
      Scanner scan = new Scanner (System.in);
      //declarations
      int start, end;
      //input
      System.out.println("Enter start: ");
      start = scan.nextInt();
      System.out.println("Enter end: ");
      end = scan.nextInt();
      
      //process and output
      while (start <= end){  //counting loop        
         System.out.println(" "+ start);
         start++;

      }
   }
}