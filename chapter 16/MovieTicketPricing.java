/*This program calculates the movie ticket price according to the criteria
Name: Ramie Theofil D. Pondar
Date: 03/16/24 */
import java.util.Scanner;

public class MovieTicketPricing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter the time of the movie (24-hour clock): ");
        int time = scanner.nextInt();

        double ticketPrice;
        //process
        if (age > 13) {
            if (time < 1700) {
                ticketPrice = 5.00; 
            } else {
                ticketPrice = 8.00; 
            }
        } else {
            if (time < 1700) {
                ticketPrice = 2.00; 
            } else {
                ticketPrice = 4.00;
            }
        }
        //output
        System.out.println("The ticket price is: $" + ticketPrice);
    }
}
