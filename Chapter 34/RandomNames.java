/*This program generates a random name 
Name: Ramie Theofil D. Pondar
Date: 03/30/24*/
import java.util.*;

public class RandomNames {
    public static void main(String[] args) {
        //declarations
        Random random = new Random();

        
        int firstNameIndex = random.nextInt(7); 
        int lastNameIndex = random.nextInt(7); 

    
        String firstName = "";
        String lastName = "";
        //process
        switch (firstNameIndex) {
            case 0: firstName = "Ramie"; break;
            case 1: firstName = "Theo"; break;
            case 2: firstName = "Sam"; break;
            case 3: firstName = "Anne"; break;
            case 4: firstName = "Justine"; break;
            case 5: firstName = "Beathryz"; break;
            case 6: firstName = "John"; break;
        }

        switch (lastNameIndex) {
            case 0: lastName = "Pondar"; break;
            case 1: lastName = "Despi"; break;
            case 2: lastName = "Gimenez"; break;
            case 3: lastName = "Rosal"; break;
            case 4: lastName = "Abundiente"; break;
            case 5: lastName = "Tambuli"; break;
            case 6: lastName = "Constantine"; break;
        }

        //output
        System.out.println("Randomly Generated Character Name");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        }    
    }       
