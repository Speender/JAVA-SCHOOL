/*This program calculates the average of the following months
Name: Ramie Theofil D. Pondar
Date: 02/20/24*/
public class AverageRainFall
{
    public static void main (String[] args)
    { 
        //declarations and input
        short april = 12;
        short may = 14;
        short june = 8;
        double average;
        //process
        average = (april + may + june) / 3.0;
        //output
        System.out.println("Rainfall for April:\t" + april);
        System.out.println("Rainfall for May:\t" + may);
        System.out.println("Rainfall for June:\t" + june);
        System.out.println("Average rainfall:\t" + average);
    }
}