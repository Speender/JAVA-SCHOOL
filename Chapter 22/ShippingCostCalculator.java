/*This program calculates the shipping cost
Name: Ramie Theofil D. Pondar
Date: 03/26/24 */
import java.util.*;

public class ShippingCostCalculator
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner (System.in);
        //declarations
        int weight;
        double shippingCost = 0;

        //input, process and output in a block of code
        do
        {
            System.out.println("Weight of Order: ");
            weight = scan.nextInt();
            if (weight > 10)
            {
                shippingCost = ((weight - 10) * 0.25) + 3.00;//operations to calculate the shipping cost
                System.out.printf("Shipping cost: $%.2f\n", shippingCost);
            } 
            else if (weight < 10 && weight > 1) //conditions for the free shipping orders less than 10 pounds
            {
                    System.out.println("Shipping cost: $3.00");
            } else //if the weight is == 0 the program ends
                System.out.println("bye");
        }while (weight != 0); //if the weight is not == to zero the looping continues
    }
}