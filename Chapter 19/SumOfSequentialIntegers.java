import java.util.*;

public class SumOfSequentialIntegers {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        int count = 1, n, loop = 0, sum;

        System.out.println("Enter N: ");
        n = scan.nextInt();

        while (count <= n) {
            loop += count;
            count++;
        }

        sum = (n * (n + 1)) / 2;

        System.out.println("Loop Sum: " + loop);
        System.out.println("Formula Sum: " + sum);

        scan.close();
    }
}