/*This program counts the total vowels, consonants, punctuation and spaces
Name: Ramie Theofil D. Pondar
Date: 03/30/24 */
import java.util.*;

public class CharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //declarations
        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;
        int spaces = 0;

        //input
        System.out.println("Enter a line of text:");
        String str = scanner.nextLine();

        //process
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            //switch to determine the special cases to be counted
            switch (Character.toLowerCase(ch)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    vowels++;
                    break;
                case ' ':
                    spaces++;
                    break;
                case '.':
                case ',':
                case '!':
                case '?':
                case ';':
                case ':':
                    punctuation++;
                    break;
                default:
                    if (Character.isLetter(ch)) //conditions for consonants
                    { 
                        consonants++;
                    }    
            }
        }
        //output
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        System.out.println("Number of punctuation characters: " + punctuation);
        System.out.println("Number of spaces: " + spaces);
    }
}
