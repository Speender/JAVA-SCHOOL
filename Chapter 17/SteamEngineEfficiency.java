/*This program calculates the efficiency of the steam engine
Name: Ramie Theofil D. Pondar
Date: 03/16/24 */
import java.util.Scanner;

public class SteamEngineEfficiency{
   public static void main (String[] args){
      Scanner scan = new Scanner (System.in);
      //declarations
      double efficiency, tAir, tSteam;
      //input
      System.out.println("Normal air temperature is about 300°K. Boiling is 373°K.");
      System.out.printf("Enter Air Temperature (In KELVIN): ");
      tAir = scan.nextDouble();
      System.out.printf("Enter Steam Temperature (In KELVIN): ");
      tSteam = scan.nextDouble();
      //process and output
      if (tSteam < 373){
         System.out.println("\nThere is no STEAM.");
         efficiency = 0;
         System.out.println("Efficiency: "+ efficiency);
         System.out.println("Air Temperature: "+ tAir + "°K");
         System.out.println("Steam Temperature: "+ tSteam + "°K");
      } else {
            efficiency = 1 - tAir / tSteam;
            System.out.println("Efficiency: "+ efficiency);
            System.out.println("Air Temperature: "+ tAir + "°K");
            System.out.println("Steam Temperature: "+ tSteam + "°K");
            }

   }
}