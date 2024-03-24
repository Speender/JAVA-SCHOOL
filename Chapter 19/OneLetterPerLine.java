import java.util.*;

public class OneLetterPerLine {
    public static void main (String[] args) {
        Scanner scan = new Scanner (System.in);
        String word;
        int letters, i = 0, j = 0;

        System.out.print("Enter a word: ");
        word = scan.nextLine();

        letters = word.length();
        
        while (i < letters) {
            System.out.println(word.charAt(j));
            j++;
            i++;
        }

    }
}