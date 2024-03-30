import java.util.Scanner;

public class CorrectChange{
   public static void main(String[]args){
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter the change in cents: ");
      int change = scan.nextInt();
      
      int dollars = change / 100;
      int quarters = change % 100 / 25;
      int dimes = change % 100 % 25 / 10;
      int nickles = change % 100 % 25 % 10 / 5;
      int pennies = change % 100 % 25 % 10 % 5;
      
      System.out.print(+ dollars + " Dollar/s,\t");
      System.out.print(+ quarters + " quarters,\t");
      System.out.print(+ dimes + " dime,\t");
      System.out.print(+ nickles + " nickles,\t");
      System.out.print(+ pennies + " cents\t");
   }
}
