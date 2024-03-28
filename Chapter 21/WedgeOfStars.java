/*This program prints inverted right triangle
Name: Ramie Theofil D. Pondar
Date: 03/26/24*/
import java.util.*;

public class WedgeOfStars {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        //declaration
        int rows;
        //input
        System.out.println("Initial number of stars: ");
        rows = scan.nextInt();
        //process and output
        while (rows >= 1) 
        {
            int i = 1;
            while (i <= rows) 
            {
                System.out.print("*");
                i++;
            }
            System.out.println();
            rows--;
        }

    }
}