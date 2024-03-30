/*This program is the same as Character Counter but it calculates the percentage of the string
Name: Ramie Theofil D. Pondar
Date: 03/30/24 */
import java.util.*;

public class CharacterCounterwithFileInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //declarations
        int vowels = 0;
        int consonants = 0;
        int punctuation = 0;
        int spaces = 0;
        int totalCharacters = 0;

        //input
        System.out.println("Enter a line of text:");
        String str = scanner.nextLine();

        //process
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            //switch to determine the special cases to be counted
            switch (Character.toLowerCase(ch)) //to lower case method to convert all capitalized letter in to small letters
            {
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
            // Increment total characters count excluding spaces
            if (ch != ' ') {
                totalCharacters++;
            }
        }

        //percentage calculations
        double totalNonSpaceCharacters = totalCharacters - spaces;
        double percentVowels = (vowels / totalNonSpaceCharacters) * 100;
        double percentConsonants = (consonants / totalNonSpaceCharacters) * 100;
        double percentPunctuation = (punctuation / totalNonSpaceCharacters) * 100;
        double percentSpaces = (spaces / (double) totalCharacters) * 100;

        //output
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        System.out.println("Number of punctuation characters: " + punctuation);
        System.out.println("Number of spaces: " + spaces);
        System.out.println("Percentage of vowels: " + percentVowels + "%");
        System.out.println("Percentage of consonants: " + percentConsonants + "%");
        System.out.println("Percentage of punctuation characters: " + percentPunctuation + "%");
        System.out.println("Percentage of spaces: " + percentSpaces + "%");
    }
}
