import java.util.Scanner;

public class Exercise1chapter15{
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.printf("Enter x: ");
        double x = scan.nextDouble();

        double e = Math.pow((1 + 1 / x), x);

        System.out.printf("Approximation to e: %.7f", e); 
    }
}