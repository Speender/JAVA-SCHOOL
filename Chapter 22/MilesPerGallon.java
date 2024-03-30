import java.util.*;

public class MilesPerGallon 
{
    public static void main(String[] args) 
    {
        //declarations
        Scanner scan = new Scanner (System.in);
        double initialMiles, finalMiles, gallon, mpg;
         
        System.out.println("Miles per Gallon Program");
        
        //input, process, and output in a block of code
        do {
        //input
            System.out.println("\nInitial Miles:"); 
            initialMiles = scan.nextDouble();

            if (initialMiles > 0) 
            {
                //also input if the initial miles is greater than 0 the loop will continue
                System.out.println("Final Miles:");
                finalMiles = scan.nextDouble();
                System.out.println("Gallons:");
                gallon = scan.nextDouble();

                mpg = (finalMiles - initialMiles) / gallon; 

                System.out.println("Miles per Gallon: " + mpg);
            }
            else {  
              System.out.println("bye"); 
            }    
        } while (initialMiles >= 0);
    }
}