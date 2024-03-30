import java.util.*;

public class AddingIntegers
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner (System.in);
        int firstInteger, sum = 0;

        System.out.print("Enter first integer (Enter 0 to quit): ");
        firstInteger = scan.nextInt();

        if (firstInteger == 0)
        {
            System.out.println("No integers were entered\nbye");
        } else 
        {    
            do
            {
                System.out.print("Enter an integer (or 0 to quit): ");
                firstInteger = scan.nextInt();
                sum += firstInteger;
            }while (firstInteger != 0);
        }
            System.out.println("Sum of Integers: "+ sum + "\nbye");
    }

}