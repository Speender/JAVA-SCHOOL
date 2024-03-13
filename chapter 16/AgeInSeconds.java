import java.util.Scanner;

public class AgeInSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int years, months, days, sec, totalDays;
        double percent;

        System.out.println("Enter your age in years: ");
        years = scan.nextInt();
        System.out.println("Enter your age in months: ");
        months = scan.nextInt();
        System.out.println("Enter your age in days: ");
        days = scan.nextInt();

        if (months == 1) {
            totalDays = 31;
        } else if (months == 2) {
            totalDays = 31 + 28;
        } else if (months == 3) {
            totalDays = 31 + 28 + 31;
        } else if (months == 4) {
            totalDays = 31 + 28 + 31 + 30;
        } else if (months == 5) {
            totalDays = 31 + 28 + 31 + 30 + 31;
        } else if (months == 6) {
            totalDays = 31 + 28 + 31 + 30 + 31 + 30;
        } else if (months == 7) {
            totalDays = 31 + 28 + 31 + 30 + 31 + 30 + 31;
        } else if (months == 8) {
            totalDays = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30;
        } else if (months == 9) {
            totalDays = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31;
        } else if (months == 10) {
            totalDays = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + 30;
        } else if (months == 11) {
            totalDays = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + 30 + 31;
        } else if (months == 12) {
            totalDays = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + 30 + 31 + 30;
        } 
        sec = (((((years * 365) + totalDays + days) * 24) * 60) * 60);
        percent = sec / 2500000000.0 * 100;

        System.out.println("Your age in seconds: " + sec);
        System.out.println("A human lifespan is about 2.5 billion seconds (2.5 billion heart-beats)");
        System.out.printf("Percentage of expected lifespan lived: %2.2f%%", percent);

    }
}
