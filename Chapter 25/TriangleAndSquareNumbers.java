/*This program determines the number if both are square and triangle
Name: Ramie Theofil D. Pondar
Date: 03/27/24 */
import java.util.*;

public class TriangleAndSquareNumbers{
    public static void main(String[] args){
        int upperLim, sum;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter upper limit: ");
        upperLim = scan.nextInt();

        System.out.println("The following are all integers from 1 to " + upperLim + " that are both square and triangle: ");
        for(int i = 1; i <= upperLim; i++){
            sum = 0;
            for(int j = 1; j <= upperLim; j++){
                sum += j;

                if(sum == i*i && sum <= upperLim){
                    System.out.println(sum);
                }
            }
        }
    }
}