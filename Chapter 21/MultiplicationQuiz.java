/*This program produces random int number (0 - 10) and multiplies it and asks the user what is the answer
Name: Ramie Theofil D. Pondar
Date: 03/25/24*/
import java.util.*; // i used '*' to declare all possible java.util packages that i can use

public class MultiplicationQuiz
{
   public static void main (String[]args)
   {
      Scanner scan = new Scanner (System.in);
      Random random = new Random();
      //declarations
      int i = 0, answer, product, score = 0, randValue1, randValue2;
      //process and output
      while (i < 10)
      {
         randValue1 = random.nextInt(10);
         randValue2 = random.nextInt(10);
         product = randValue1 * randValue2;
         System.out.print("What is "+ randValue1 + " * "+ randValue2 + "?: ");
         answer = scan.nextInt();
         
         if (answer == product){
            System.out.println("Right!");
            score++;
         } else{
            System.out.println("Wrong. " + randValue1 + " * " + randValue2 + " is " + product);
         }
         
         i++;
      }
      System.out.println("You got "+ score + " out of 10 questions correct!");
   }
}