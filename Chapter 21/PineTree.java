/*This program prints a pine tree
Name: Ramie Theofil D. Pondar
Date: 02/26/24*/
import java.util.*;

public class PineTree{
   public static void main(String[]args){
      Scanner scan = new Scanner (System.in);
      //declarations and input
      System.out.print("Enter the number of rows for the pyramid: ");
        int rows = scan.nextInt();
         
        // prints the pyramid first
        //outputs
        int i = 1;
        while (i <= rows) 
        {
            int j = 1;
            while (j <= rows - i) 
            {
                System.out.print(" ");
                j++;
            }
            j = 1;
            while (j <= 2 * i - 1) 
            {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
            //calculations for the trunk width and height
            int trunkHeight = rows / 2;
            int trunkWidth = i /4;
            int k = 1;
            
            //prints the trunk of the pine tree
            while (k <= trunkHeight)
            {
               int l = 1;
               while (l <= rows - trunkWidth)
               {
                  System.out.print(" ");
                  l++;
               }
               int m = 1;
               while (m <= trunkWidth * 2 - 1)
               {
                  System.out.print("*");
                  m++;
               }
                 System.out.println();
                 k++;

            }
  }
}