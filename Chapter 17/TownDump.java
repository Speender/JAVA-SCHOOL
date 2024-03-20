import java.util.Scanner;

public class TownDump{
   public static void main (String[] args){
      Scanner scan = new Scanner (System.in);
      final int total = 20;
      
      System.out.println("Enter Weight load: ");
      int weight = scan.nextInt();
      
      if (weight > 200){
         int newWeight = weight - 200;
         int secondaryTotal = (newWeight / 100) * 8; //divide 100 para makuha ang number sa ika hundreds place and ma time sa 8 na val :))
         int charge = secondaryTotal + total;
         System.out.println("You received: $"+ charge);
      }else
         System.out.println("You received: $"+ total);

   }
}