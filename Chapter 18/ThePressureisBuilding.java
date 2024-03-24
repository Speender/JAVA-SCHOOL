import java.util.Scanner;

public class ThePressureisBuilding {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int fRight, fLeft, bRight, bLeft;
        
        System.out.println("Input right front pressure: ");
        fRight = scan.nextInt();
        System.out.println("Input left front pressure: ");
        fLeft = scan.nextInt();
        System.out.println("Input right rear pressure: ");
        bRight = scan.nextInt();
        System.out.println("Input left rear pressure: ");
        bLeft = scan.nextInt();
        
        if (fRight == fLeft && bRight == bLeft){
         System.out.println("Inflation is OK");
        } else {
         System.out.println("Inflation is not OK");
        }
    }
}