/*This program receives the string and counts the characters and loops the string on how much character it has
Name: Ramie Theofil D. Pondar
Date:03/25/24 */
import java.util.*;

public class RepeatedlyEchoAWord {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        //declarations
        String len;
        int i = 1, str;
        //input
        System.out.println("Enter a word: ");
        len = scan.nextLine();

        str = len.length();//I used the length method to count the total string of characters given by the user

        System.out.println(" "); //Space in between the input and outpu
            
        while (i <= str) { //counting loop
            System.out.println(len); //output
            i++;
        }

    }
}