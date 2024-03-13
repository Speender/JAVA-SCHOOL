import java.util.Scanner;

public class PieEatingContest{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int weight;
      
      System.out.printf("Input contestant's weight in pounds(lbs): ");
      weight = scan.nextInt();
      
      
      
      if (weight >= 220 && weight <= 280 ){
         System.out.println("You are eligible to enter the eating contest!");
      } else
            System.out.println("I'm sorry, you are not eligible to enter better luck next time!");
      
   }
}