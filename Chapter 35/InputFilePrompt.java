/*This program asks the user for their file name and checks the input value if it meets the criteria
Name: Ramie Theofil D. Pondar
Date: 03/29/24 */
import java.util.*;

public class InputFilePrompt {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String fileName;

        do {
            System.out.print("input file: ");
            fileName = scanner.nextLine().trim();//I used trim to remove unnecessary whitespaces

            //condition that checks the file name if it doesnt meet the criteria it loops back to the user input
            if (fileName.isEmpty() || fileName.equals(".dat")) {
                System.out.println(">>>file name missing<<<");
                continue;
            }
            if (fileName.contains(" ")) 
            {
                System.out.println(">>>file name must not contain spaces<<<");
                continue;
            }
            if (!fileName.endsWith(".dat")) {
                System.out.println(">>>file name must end with .dat<<<");
                continue;
            }
            System.out.println("OK");
            break;//I used break in order not to have an infinite loop
        } while (true);
    }
}
