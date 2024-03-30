/*This program calculates the discount price
Name: Ramie Theofil D. Pondar
Date: 03/16/24*/
import java.util.Scanner;

public class DiscountPrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //declarations
        int purchase, discountedPrices;
        final double discount = 0.10;
        //input
        System.out.print("Enter amount of purchases: ");
        purchase = scan.nextInt();
        //process
        if (purchase >= 1000)
            discountedPrices = purchase - (int) (purchase * discount);
        else 
            discountedPrices = purchase;
        //output
        System.out.println("Discounted price: " + discountedPrices);
    }
}
