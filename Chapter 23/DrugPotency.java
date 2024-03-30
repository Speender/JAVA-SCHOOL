/*This program calculates the drug potency
Name: Ramie Theofil D. Pondar
Date: 03/26/24*/
public class DrugPotency {
    public static void main(String[] args) {
        //declarations
        final double rate = 0.04;
        double effectiveness = 100;
        int month = 0;

        //loop until the drug's effectiveness falls below 50%
        while(effectiveness > 50){
            //output the current month and the drug's effectiveness
            System.out.println("month: " + month + "\teffectiveness: " + effectiveness);
            effectiveness = effectiveness - (effectiveness * rate); //process for every month's effectiveness

            month++;
        }

        //output
        System.out.println("month: " + month + "\teffectiveness: " + effectiveness + " DISCARDED");
    }
}
