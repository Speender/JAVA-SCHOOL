/*This program prints the meaning of the acronyms repeatedly
Name: Ramie Theofil D. Pondar
Date: 03/30/24 */
import java.util.*;

public class InternetAcronyms {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //declarations
        HashMap<String, String> acronyms = new HashMap<>();

        acronyms.put("U.S.A.", "United States of America");
        acronyms.put("A.I.", "Artificial Intelligence");
        acronyms.put("N.G.O.", "Non-Governmental Organization");
        acronyms.put("WW.I.I.", "World War II");

        //process
        while (true) {
            System.out.println("Enter a line of text (or 'exit' to quit): ");
            String line = scanner.nextLine();

            if (line.equalsIgnoreCase("exit")) {
                break;
            }

            StringBuilder expandedLine = new StringBuilder();
            Scanner lineScanner = new Scanner(line);

            while (lineScanner.hasNext()) {
                String word = lineScanner.next();

                if (acronyms.containsKey(word)) {
                    expandedLine.append(acronyms.get(word) + " ");
                } else {
                    expandedLine.append(word + " ");
                }
            }
            //output
            lineScanner.close();
            System.out.println(expandedLine.toString().trim() + "\n");
        }

    
    }
}
