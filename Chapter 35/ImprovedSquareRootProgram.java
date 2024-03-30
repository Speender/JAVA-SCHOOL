/*this program asks the user for a value and checks the value if it met the criteria and prints the square root value and loops back 
if the user wants to ask again
Name: Ramie Theofil D. Pondar
Date: 03/30/24 */
import java.util.*;

public class ImprovedSquareRootProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //declarations
        double val, squareRoot;
        boolean loopingCondition = true;
        boolean validResponse = false;
        String userResponse;

        do {
            //Input
            do { //looping for the enter a number question if the value given by the user is < 0 the looping will start again otherwise it will end
                System.out.print("Enter a number --> ");
                val = scan.nextDouble();
                scan.nextLine();

                if (val < 0) { 
                    System.out.println(">>>Number must be positive<<<");
                }
            } while (val < 0);
            //if the value given by the user is > 0 the loop will end and prints the answer
            squareRoot = Math.sqrt(val);
            System.out.println("Square root of " + val + " is " + squareRoot);
            

            do {
                System.out.println("Do you wish to continue (yes or no)? ");
                userResponse = scan.nextLine().toLowerCase();
                /*I used toLowerCase(); method so whenever the user enters YES || Yes || NO || No, the string will automatically be converted into lower case
                Therefore it will be YES || Yes = yes && NO || No = no*/
                if (userResponse.equals("yes") || userResponse.equals("no")) {
                    validResponse = true;
                } else {
                    System.out.println(">>>Please respond with (yes or no)<<<");
                }
            } while (!validResponse);

            loopingCondition = userResponse.equals("yes");
        } while (loopingCondition);

        System.out.println("Bye");
    }
}
