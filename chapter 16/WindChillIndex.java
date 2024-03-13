import java.util.Scanner;

public class WindChillIndex{
   public static void main(String[]args){
      Scanner scan = new Scanner (System.in);
      int windSpeed, temperature;
      double windChill = 0;
      
      System.out.println("Enter Wind Speed: ");
      windSpeed = scan.nextInt();
      System.out.println("Enter Temperature: ");
      temperature = scan.nextInt();
      
      if (windSpeed < 3){
         windChill = temperature;
      } else if (temperature > 50 ){
         windChill = temperature;
      } else
         windChill = 35.74 + 0.6215 * temperature - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * temperature * Math.pow(windSpeed, 0.16);
         System.out.println("Wind Chill: "+ windChill);
   }
}