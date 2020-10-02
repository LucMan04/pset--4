package src;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Side      : ");
        double side = input.nextDouble();

        double perimeter = side * 6;

        double area = 6 *(Math.sqrt(3) / 4) * Math.pow(side, 2);

        String pattern = "###,##0.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        decimalFormat.format(area);

        System.out.println(("\nArea      : " + decimalFormat.format(area)));
        System.out.println("Perimeter : " + decimalFormat.format(perimeter));

        input.close();
    }
}