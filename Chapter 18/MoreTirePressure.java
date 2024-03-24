import java.util.Scanner;

public class MoreTirePressure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fRight, fLeft, bRight, bLeft;

        System.out.println("Input right front pressure:");
        fRight = scanner.nextInt();
        if (fRight < 35 || fRight > 45) {
            System.out.println("Warning: pressure is out of range");
        }

        System.out.println("Input left front pressure:");
        fLeft = scanner.nextInt();
        if (fLeft < 35 || fLeft > 45) {
            System.out.println("Warning: pressure is out of range");
        }

        System.out.println("Input right rear pressure:");
        bRight = scanner.nextInt();
        if (bRight < 35 || bRight > 45) {
            System.out.println("Warning: pressure is out of range");
        }

        System.out.println("Input left rear pressure:");
        bLeft = scanner.nextInt();
        if (bLeft < 35 || bLeft > 45) {
            System.out.println("Warning: pressure is out of range");
        }

        if (fRight < 35 || fRight > 45 ||
            fLeft < 35 || fLeft > 45 ||
            bRight < 35 || bRight > 45 ||
            bLeft < 35 || bLeft > 45) {
            System.out.println("Inflation is BAD");
        } else {
            System.out.println("Inflation is GOOD");
        }
    }
}
