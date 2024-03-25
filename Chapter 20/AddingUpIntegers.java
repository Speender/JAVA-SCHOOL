import java.util.*;

public class AddingUpIntegers{
   public static void main (String[]args){
      Scanner scan = new Scanner (System.in);
      int add, sum = 0, i = 0; //I initialized the variable sum and i so that when it starts compiling I wont receive an error
      System.out.println("How many Integers will be added: ");//input
      int size = scan.nextInt();
      
      while (i < size){
            System.out.println("Enter an Integer: ");
            add = scan.nextInt();
            sum += add; //every looping the value adds up
            i++;

      }
        
        System.out.println("The sum is: "+ sum);      
   }
}