import java.util.Scanner;

public class FantasyGame{
   public static void main(String[] args){
      Scanner scan = new Scanner (System.in);
      String charname;
      
      System.out.println("Welcome to Yertle's Quest");
      System.out.println("You have 15 stat points");
      System.out.println("Enter the name of your character: ");
      charname = scan.nextLine();
      System.out.println("Enter Strength(1 - 10): ");
      int stren = scan.nextInt();
      System.out.println("Enter health(1 - 10): ");
      int health = scan.nextInt();
      System.out.println("Enter luck (1 - 10): ");
      int luck = scan.nextInt();
      
      int stats = stren + health + luck;
      if (stats > 15){
         System.out.println("You have give your character too many points!  Default values have been assigned:");
         System.out.println(" "+ charname + "Strength: 5, Health: 5, Luck: 5");

      }else {
         System.out.println(" "+ charname + " , Strength: "+ stren + ", Health: "+ health + ", Luck: "+ luck);

      }
   }
}