import java.util.Scanner;

public class Exercise2chapter15{
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.printf("Input an angle: ");
        double deg = scan.nextDouble();

        double rad = Math.toRadians(deg);
        double sin = Math.sin(rad);
        double cos = Math.cos(rad);
        double sinsquared = Math.pow((Math.sin(rad)), 2);
        double cossquared = Math.pow((Math.cos(rad)), 2);
        double sum = sinsquared + cossquared;

        System.out.printf("sin (%.2f)\tis: %.2f\n", deg, sin);
        System.out.printf("cos (%.2f)\tis: %.2f\n", deg, cos);
        System.out.printf("sin (%.2f)^2\tis: %.2f\n", deg, sinsquared);
        System.out.printf("cos (%.2f)^2\tis: %.2f\n", deg, cossquared);
        System.out.printf("sum\t\tis: %.2f", sum);
    }
}