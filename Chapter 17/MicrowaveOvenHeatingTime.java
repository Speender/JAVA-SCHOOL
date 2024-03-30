/*This program calculates the  total time for the microwave
Name: Ramie Theofil D. Pondar
Date: 03/16/24*/
import java.util.Scanner;

public class MicrowaveOvenHeatingTime{
   public static void main (String[] args){
      Scanner scan = new Scanner (System.in);
      //declarations
      int val1 = 0, val2 = 0, val3 = 0, val4 = 0;
      //input
      System.out.printf("How many items to heat?: ");
      int items = scan.nextInt();
      System.out.printf("Time for one item: ");
      int time = scan.nextInt();
      //process
      if (time <= 1000){
         val1 = time / 100 % 10;
         val2 = time / 10 % 10;
         val3 = time % 10;
      } else if (time > 1000){
            val1 = time / 100 % 10;
            val2 = time / 10 % 10;
            val3 = time % 10;
      }
      //output
      System.out.println("Heat for "+ val1 + "Minutes" + " "+ val2 + val3 +"seconds"); 
     
   }
}