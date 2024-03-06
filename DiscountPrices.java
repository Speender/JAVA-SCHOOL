import java.util.Scanner;

public class DiscountPrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int purchase, discountedPrices;
        final double discount = 0.10;

        System.out.print("Enter amount of purchases: ");
        purchase = scan.nextInt();

        if (purchase >= 1000)
            discountedPrices = purchase - (int) (purchase * discount);
        else 
            discountedPrices = purchase;

        System.out.println("Discounted price: " + discountedPrices);
    }
}
