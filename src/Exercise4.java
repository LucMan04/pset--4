package src;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Centimeters : ");
        double givenCentimeters = keyboard.nextDouble();
        keyboard.close();

        int centimeters = (int) givenCentimeters;

        int kilometers = centimeters / 100000;
        int beforeMeters = centimeters - (kilometers * 100000);

        int meters = beforeMeters / 100;
        int remainingCentimeters = beforeMeters - (meters * 100);

        System.out.print("\nKilometers  : " + kilometers + "\nMeters      : " + meters + "\nCentimeters : " + remainingCentimeters + "\n");
    }
}
