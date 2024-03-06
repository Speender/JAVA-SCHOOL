import java.util.Scanner;

public class LastChanceGas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double tankCapacity, gaugeReading, milesPerGallon, remainingMiles;

        System.out.print("Tank capacity: ");
        tankCapacity = scanner.nextDouble();
        System.out.print("Gage reading: ");
        gaugeReading = scanner.nextInt();
        System.out.print("Miles per gallon: ");
        milesPerGallon = scanner.nextInt();

       
        remainingMiles = (tankCapacity * (gaugeReading / 100.0) * milesPerGallon);

        if (remainingMiles >= 200) {
            System.out.println("Safe to Proceed");
        } else {
            System.out.println("Get Gas!");
        }

    }
}
