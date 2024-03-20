import java.util.Scanner;

public class MicrowaveOvenHeatingTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("How many items to heat: ");
        int items = scan.nextInt();
        System.out.print("Time for one item: ");
        int time = scan.nextInt();

        int seconds;
        if (time < 100) {
            seconds = time;
        } else {
            int minutes = time / 100;
            int remainingSeconds = time % 100;
            seconds = minutes * 60 + remainingSeconds;
        }

        if (items == 1) {
        } else if (items == 2) {
            seconds += seconds / 2;
        } else if (items == 3) {
            seconds *= 2;
        } else {
            System.out.println("Heating more than three items at once is not recommended.");
            return;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;


        System.out.println("Heat for " + minutes + " minutes " + remainingSeconds + " seconds");
    }
}
