import java.util.Scanner;

public class GroundBeefCalculator{
   public static void main(String[] args){
      Scanner scan = new Scanner (System.in);
      double priceA, priceB;
      int leanA, leanB;
      
      System.out.print("Input price per pound package A: ");
      priceA = scan.nextDouble();
      System.out.print("Input percent of lean package A: ");
      leanA = scan.nextInt();
      
      System.out.print("Input price per pound package B: ");
      priceB = scan.nextDouble();
      System.out.print("Input percent of lean package A: ");
      leanB = scan.nextInt();
      
      double packageA = priceA / (leanA / 100.0);
      double packageB = priceB / (leanB / 100.0);
      
      System.out.println("Package A cost per pound of lean:" + packageA);
      System.out.println("Package B cost per pound of lean:" + packageB);


      
      if (packageA < packageB){
         System.out.println("Package A is the best value!");
         }else
               System.out.println("Package B is the best value!");
           
   }
}