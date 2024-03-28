/*This program receives the data of the user's time and timezones and calculates how long does it take to recover from a jet lag
Name: Ramie Theofil D. Pondar
Date: 03/25/24*/
import java.util.*;

public class JetLagCalculator{
   public static void main(String[]args){
      Scanner scan = new Scanner (System.in);
      //declarations
      int hour, zones, depart, arrival;
      double daysRecovery; 
        //input
        System.out.println("Jet Lag Calculator");
        System.out.println("Enter the number of hours traveled (0-24): ");
        hour = scan.nextInt();
        
        System.out.println("Enter the number of zones crossed: ");
        zones = scan.nextInt();
        
        System.out.println("Enter the departure time based on the table below: ");
        System.out.println("0, for departures between 8AM and noon");  
        System.out.println("1, for departures between noon and 6PM");  
        System.out.println("3, for departures between 6PM and 10PM");  
        System.out.println("4, for departures between 10PM and 1AM");  
        System.out.println("5, for departures between 1AM and 8AM");
        depart = scan.nextInt();
        
        System.out.println("Enter the arrival time based on the table below: ");
        System.out.println("4, for arrivals between 8AM and noon"); 
        System.out.println("2, for arrivals between noon and 6PM");
        System.out.println("0, for arrivals between 6PM and 10PM");
        System.out.println("1, for arrivals between 10PM and 1AM");
        System.out.println("3, for arrivals between 1AM and 8AM");
        arrival = scan.nextInt();
        //process
        daysRecovery = (hour / 2.0 + (zones - 3.0) + depart + arrival) / 10;
        //output
        System.out.println("Days of recovery: " + daysRecovery + " days");
   }
}