/* This program is 1/B by Isaac Newton
Name: Ramie Theofil D. Pondar 
Date: 03/26/24*/
import java.util.*;

public class OneOverB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //declarations
        double x, B;
        //input
        System.out.println("Enter B value: ");
        B = scan.nextDouble();
        
        //condition for the error
        if(B == 0){
            System.out.println("Anything divided by 0 is always undefined. Please enter another number greater than 0.");
            return;
        }
        else if(B > 1.0E10){ //1.0E10 is 1.0x^10 so the user must not enter a number higher than the size of a data type
            System.out.println("Number too big. Enter a smaller number.");
            return;
        }


        System.out.println("Enter your guess: ");
        x = scan.nextDouble();

        if(x > 1/B){
            System.out.println("Your guess is way out of range (0 - (1/B)). Try entering a smaller value");
            return;
        }

        double guess = x * (2 - B * x);
        System.out.println(guess);


        while(Math.abs(guess - x) >= 1.0E-14){
            x = guess;
            guess = x * (2 - B * x);
            System.out.println(guess);
        }
    }
}

