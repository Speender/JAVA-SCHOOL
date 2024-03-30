/*This program calculates the money to be received when you throw your garbage properly
Name: Ramie Theofil D. Pondar
Date: 03/16/24 */
import java.util.Scanner;

public class TownDump{
   public static void main (String[] args){
      Scanner scan = new Scanner (System.in);
      //declarations
      final int total = 20;
      //input
      System.out.println("Enter Weight load: ");
      int weight = scan.nextInt();
      //process and output
      if (weight > 200){
         int newWeight = weight - 200;
         int secondaryTotal = (newWeight / 100) * 8; //divide 100 para makuha ang number sa ika hundreds place and ma time sa 8 na val :))
         int charge = secondaryTotal + total;
         System.out.println("You received: $"+ charge);
      }else
         System.out.println("You received: $"+ total);

   }
}