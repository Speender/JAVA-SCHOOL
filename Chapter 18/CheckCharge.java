import java.util.Scanner;

public class CheckCharge{
   public static void main(String[]args){
      Scanner scan = new Scanner(System.in);
      double savings, checking, serviceCharge;
      
      System.out.println("Input balance (Savings Account): ");
      savings = scan.nextDouble();
      System.out.println("Input balance (Checking Account): ");
      checking = scan.nextDouble();
      
      if(checking > 1000 || savings > 1500){
         serviceCharge = 0;         
      }else{
         serviceCharge = 0.15;
      }
      System.out.println("Service Charge: "+ serviceCharge);
   }
}