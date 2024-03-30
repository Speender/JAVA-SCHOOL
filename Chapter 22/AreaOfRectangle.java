import java.util.*;
public class AreaOfRectangle
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);
        //declarations
        int x1, y1, x2, y2, height, width, area = 0;

        System.out.println("Computer Aided Design Program");

        //input, process, and output in a block of code
        do {
            //inputs
            System.out.print("Firts corner X coordinate: ");
            x1 = scan.nextInt();
            System.out.print("Firts corner Y coordinate: ");
            y1 = scan.nextInt();
            System.out.print("Second corner X coordinate: ");
            x2 = scan.nextInt();
            System.out.print("Second corner Y coordinate: ");
            y2 = scan.nextInt();

            //process
            width = x2 - x1;
            height = y2 - y1;
            area  = width * height;

            //output
            System.out.println("Width: " + width + "\tHeight: " + height + "\tArea: " + area + "\n");
        } while (area != 0); //if the area is not equal to 0 the looping continues otherwise the looping will end

        System.out.println("finished");

    }
}