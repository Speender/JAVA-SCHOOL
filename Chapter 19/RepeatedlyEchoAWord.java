import java.util.*;

public class RepeatedlyEchoAWord {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        String len;
        int i = 1, str;

        System.out.println("Enter a word: ");
        len = scan.nextLine();

        str = len.length();

        System.out.println("");

        while (i <= str) {
            System.out.println(len);
            i++;
        }

    }
}