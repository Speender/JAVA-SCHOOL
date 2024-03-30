/*This program calculates your age 
Name: Ramie Theofil D. Pondar
Date: 03/16/24 */
import java.util.Scanner;

public class Y2KProblemDetector{
   public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      //declarations
      int birth, year, age;
      //input
      System.out.printf("Year of Birth: ");
      birth = scan.nextInt();
      System.out.printf("Current year: ");
      year = scan.nextInt();
      //process
      if (year <= birth){
         year += 100;
      }
      age = year - birth;
      //output
         System.out.println("Your age: "+ age);
   }
}