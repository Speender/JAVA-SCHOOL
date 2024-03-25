import java.util.*;

public class HarmonicSum{
   public static void main(String[]args){
      Scanner scan = new Scanner (System.in);
        int n, i = 1;
        double sum = 0;

        System.out.println("Enter N: ");
        n = scan.nextInt();

        while (i <= n) {
            sum += 1.0 / i;
            i++;
        }

        System.out.println("Sum is: " + sum);
     

   }
}