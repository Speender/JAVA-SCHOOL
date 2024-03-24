import java.util.*;

public class WordsSeparatedByDots {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1, word2;
        int i;

        System.out.println("Enter first word: ");
        word1 = scan.nextLine();
        System.out.println("Enter second word: ");
        word2 = scan.nextLine();

        i = word1.length() + word2.length();

        System.out.print(word1);
        while (i <= 30) {
            System.err.print(".");
            i++;
        }
        System.out.print(word2);

    }
}