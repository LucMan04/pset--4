package src;

import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.Math.pow;

public class Exercise1 {
    public static void main (String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Temperature : ");
        double temperature = keyboard.nextDouble();

        System.out.print("Wind Speed  : ");
        double windSpeed = keyboard.nextDouble();

        keyboard.close();

        double windChill = 35.74 + (0.6215 * temperature) + ((.4275 * temperature) - 35.75) * pow(windSpeed, 0.16);

        String pattern = "###,##0.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String finalWindChill = decimalFormat.format(windChill);

        System.out.print("\nWind Chill  : " + finalWindChill + "\n");
    }
}