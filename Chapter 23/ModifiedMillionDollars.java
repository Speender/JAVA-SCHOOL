import java.util.*;
public class ModifiedMillionDollars
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner (System.in);
        double dollars = 0, rate, initialInvestment, contribution;
        int year = 0;
        
        System.out.println("Enter Interest rate: ");
        rate = scan.nextDouble();
        System.out.println("Enter initial investment: ");
        initialInvestment = scan.nextDouble();
        System.out.println("Enter annual contribution: ");
        contribution = scan.nextDouble();

        while (dollars <= 1000000)
        {
            year++;
            dollars += initialInvestment * rate;
            dollars += contribution;
        }
        System.out.println("It will take "+ year + "years to reach $1,000,000");
    }
}