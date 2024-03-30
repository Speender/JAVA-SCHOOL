/*This program adds the value within the range and the total value within and outside the given range
Name: Ramie Theofil D. Pondar
Date: 03/26/24 */
import java.util.*;

public class InRangeAdder
{
    public static void main(String[]args)   
    {
        Scanner scan = new Scanner (System.in);
        //declarations
        int lowRange, highRange, value, inRange = 0, outRange = 0;
        //input
        System.out.println("In-range Adder");
        System.out.println("Low end of range: ");
        lowRange = scan.nextInt();
        System.out.println("High end of range: ");
        highRange = scan.nextInt();

        do
        {
            System.out.println("Enter data: ");//also input
            value = scan.nextInt();
            if(value >= lowRange && value <= highRange)//in range conditions
            {
                inRange += value;
            } else //out range condition
                outRange += value;
        } while (value != 0);//if the user inputs 0 the looping will end
        //output
        System.out.println("Sum of in range values: "+ inRange);
        System.out.println("Sum of out range value: "+ outRange);
    }
}