/*This program is a wallpaper calculator
Name: Ramie Theofil D. Pondar
Date: 03/26/24*/
import java.util.*;

public class WallpaperCalculator {
    public static void main (String[] args) {
        //declarations
        Scanner scan = new Scanner (System.in);
        int i = 1, opening;
        double height, width, length, area, openingHeight, openingWidth, openingArea = 0;
        final double wallpaperArea = 27 * (4.5 * 36); // constant value of the wallpaper roll area
        final double sqrInch = 1550.0031; // constant value to be used for conversion

        //input
        System.out.println("Enter room dimensions in meters");
        System.out.println("Enter room height: ");
        height = scan.nextDouble();
        System.out.println("Enter room width: ");
        width = scan.nextDouble();
        System.out.println("Enter room length: ");
        length = scan.nextDouble();

        System.out.print("\nEnter the number of openings: ");
        opening = scan.nextInt();

        //input and process
        while (i <= opening) {
            System.out.println("Enter dimension of opening #" + i + ": ");
            System.out.print("Enter height: ");
            openingHeight = scan.nextDouble();
            System.out.print("Enter width: ");
            openingWidth = scan.nextDouble();

            openingArea += openingHeight * openingWidth;
            i++;
        }

        area = (((2 * height * length) + (2 * width * length)) - (openingArea)) * sqrInch; 

        double wallpaperNeeded = area / wallpaperArea; 

        //ouput
        System.out.printf("Number of rolls needed: %d", (int)Math.ceil(wallpaperNeeded)); 

    }
}