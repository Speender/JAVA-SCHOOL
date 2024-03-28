/*This program converts the degrees to radians
Name: Ramie Theofil D. Pondar
Date: 02/20/24*/
public class DegreesToRadians
{
    public static void main (String[] args)
    {
        //declarations and input
        short degrees = 30;
        //also declaration but with process
        double rad = degrees * Math.PI / 180;
        //process
        System.out.println("radians: " + rad);
    }
}