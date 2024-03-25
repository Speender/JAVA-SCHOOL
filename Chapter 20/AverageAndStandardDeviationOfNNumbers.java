import java.util.*;

public class AverageAndStandardDeviationOfNNumbers{
   public static void main(String[]args){
      Scanner scan = new Scanner (System.in);
      int i = 0;
      double n, sd, avgSq, xi = 1, xi2 = 1, sum = 0, sum2 = 0, avg, avg2;
      
      System.out.println("Input N: "); //input
      n = scan.nextDouble();
      
      while (i < n){
         System.out.println("Xi: ");
         xi = scan.nextDouble();
         xi2 = Math.pow(xi , 2); //every loop different value therefore every looping the power function squares different value given by the user
         sum += xi; //every loop the value adds up
         sum2 += xi2;
         i++;
    }    
         //process
         avg = sum / n;
         avg2 = Math.pow (avg , 2);
         avgSq = sum2 / n;
         sd = Math.sqrt (avgSq - avg2);
         //output
         System.out.println("Sum: "+sum);
         System.out.println("Sum^2: "+sum2);
         System.out.println("Average: "+ avg);
         System.out.println("Standard Deviation: "+sd);
    
  }
}