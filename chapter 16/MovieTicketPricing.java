import java.util.Scanner;

public class MovieTicketPricing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Enter the time of the movie (24-hour clock): ");
        int time = scanner.nextInt();

        double ticketPrice;
        
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
        System.out.println("The ticket price is: $" + ticketPrice);
    }
}
