import java.util.Scanner;

public class OrderChecker{
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        int bolts, nuts, washer, total;
        final int boltPrice = 5, nutPrice = 3, washerPrice = 1;
        
        System.out.printf("Number of bolts: ");
        bolts = scan.nextInt();
        System.out.printf("Number of nuts: ");
        nuts = scan.nextInt();
        System.out.printf("Number of washer: ");
        washer = scan.nextInt();

        total = (boltPrice * bolts) + (nutPrice * nuts) + (washerPrice * washer);
        if (nuts < bolts){
            System.out.println("Check the Order: too few nuts");
        }
        if (washer < bolts * 2){
            System.out.println("Check the order: too few washers");
        }

        System.out.println("Total Cost: " + total);      
    }
}