import java.util.Scanner;

public class Y2KProblemDetector{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int birth, year, age;
      
      System.out.printf("Year of Birth: ");
      birth = scan.nextInt();
      System.out.printf("Current year: ");
      year = scan.nextInt();
      
      if (year <= birth){
         year += 100;
      }
      age = year - birth;
         System.out.println("Your age: "+ age);
   }
}