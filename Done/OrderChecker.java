/*This program checks if the your order has met the criteria in order to proceed
Name: Ramie Theofil D. Pondar
Date: 03/16/24 */
import java.util.Scanner;

public class OrderChecker{
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);
        //declarations
        int bolts, nuts, washer, total;
        final int boltPrice = 5, nutPrice = 3, washerPrice = 1;
        //input
        System.out.printf("Number of bolts: ");
        bolts = scan.nextInt();
        System.out.printf("Number of nuts: ");
        nuts = scan.nextInt();
        System.out.printf("Number of washer: ");
        washer = scan.nextInt();
        //process
        total = (boltPrice * bolts) + (nutPrice * nuts) + (washerPrice * washer);
        if (nuts < bolts){
            System.out.println("Check the Order: too few nuts");
        }
        if (washer < bolts * 2){
            System.out.println("Check the order: too few washers");
        }
        //output
        System.out.println("Total Cost: " + total);      
    }
}