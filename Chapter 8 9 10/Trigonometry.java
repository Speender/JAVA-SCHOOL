/*This program calculates the sin and cos of the x value
Name: Ramie Theofil D. Pondar
Date: 02/20/24*/
public class Trigonometry
{
    public static void main (String[] args)
    { 
        //declarations, input  and process
        double value = 0.5236;
        double sinx = Math.sin(value);
        double cosx = Math.cos(value);
        double sum = (sinx * sinx) + (cosx * cosx);
        //output
        System.out.println("sine: " + sinx + " cosine: " + cosx + " sum of squares: " + sum );
    }
}