/*This program calculates all the odd numbers 
Name: Ramie Theofil D. Pondar
Date: 3/29/24 */
import java.util.*;

public class SumOfOdd1ToN {
    public static void main(String[] args) 
    {   
        //declarations
        int num, sum = 0, total;

        Scanner scan = new Scanner(System.in);
        //input
        System.out.print("Enter N: ");
        num = scan.nextInt();
        //process
        for(int i = 1; i <= num; i++){
            if(i % 2 == 1)
                sum += i;
        }

        total = num * num;

        //output
        System.out.println("Sum = " + sum);
        System.out.println("N^2 = " + total);
    }
}
