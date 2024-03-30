/*This program calculates if your vehicle needs to get gas
Name: Ramie Theofil D. Pondar
Date: 03/16/24 */
import java.util.Scanner;

public class LastChanceGas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //declarations
        double tankCapacity, gaugeReading, milesPerGallon, remainingMiles;
        //input
        System.out.print("Tank capacity: ");
        tankCapacity = scanner.nextDouble();
        System.out.print("Gage reading: ");
        gaugeReading = scanner.nextInt();
        System.out.print("Miles per gallon: ");
        milesPerGallon = scanner.nextInt();

       //process
        remainingMiles = (tankCapacity * (gaugeReading / 100.0) * milesPerGallon);
        //output
        if (remainingMiles >= 200) {
            System.out.println("Safe to Proceed");
        } else {
            System.out.println("Get Gas!");
        }

    }
}
