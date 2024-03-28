/*This program calculates the factorial of the float N
Name: Ramie Theofil D. Pondar
Date: 03/25/24*/
import java.util.*;

public class FloatFactorial {
    public static void main (String[] args) {
        //declarations
        Scanner scan = new Scanner( System.in );
        double fact = 1;
        long N;

        //input
        System.out.print( "Enter N: " );
        N = scan.nextLong();

        //process and outputs
        if ( N >= 0 && N <= 20 ) {
            while ( N > 1 ) { 
                  fact = fact * N;
                  N = N - 1;
            }
            System.out.println( "factorial is " + fact ); 
        } else { 
            System.out.println("N must be between 0 and 20");
            System.out.println("Factorial for N less than 0 is not defined.");
            System.out.println("Factorial for N greater than 20 causes overflow.");
        }

    }
}