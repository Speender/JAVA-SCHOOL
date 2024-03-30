import java.util.Scanner;
public class OhmsLaw{
   public static void main(String[]args){
      //I = (v + 0.0) / r
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter voltage: ");
      double v = scan.nextDouble();
      System.out.println("Enter resistance: ");
      double r = scan.nextDouble();
      
      double i = (v + 0.0) / r;
      System.out.println("I = " + i); 


   }
}