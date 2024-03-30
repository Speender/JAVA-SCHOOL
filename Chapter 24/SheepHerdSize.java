/*This program calculates how many years the sheep heard must be supervised
Name: Ramie Theofil D. Pondar
Date: 3/29/24*/
public class SheepHerdSize {
    public static void main(String[] args) {
        //declaration
        double N = 20;
        int years = 0;

        //input and process
        for (int i = 0; i<=25; i++){
            N = 220/(1 + 10 * Math.pow(0.83, i));
            System.out.println("Population: " + N + "\tYear: " + i);

            if(N >= 80){
                years = i;
                break;
            }
                
        }
        //output
        System.out.println("\nThe sheep herd must be supervised for " + years + " years");
    }
}
