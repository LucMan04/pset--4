package src;

import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.PI;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Length       : ");
        double length = keyboard.nextDouble();

        System.out.print("Width        : ");
        double width = keyboard.nextDouble();

        System.out.print("Diameter     : ");
        double diameter = keyboard.nextDouble();

        keyboard.close();

        double areaWithCircle = length * width;
        double radius = diameter / 2;
        double circleArea = PI * pow(radius, 2);
        double area = areaWithCircle - circleArea;

        String pattern = "###,##0.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String finalArea = decimalFormat.format(area);

        System.out.print("\nSurface Area : " + finalArea + "\n");

    }
}