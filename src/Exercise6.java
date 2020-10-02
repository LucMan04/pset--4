package src;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Length    : ");
        double length = input.nextDouble();

        System.out.print("Width     : ");
        double width = input.nextDouble();

        double area = length * width;
        double perimeter = (2 * length) + (2 * width);
        double diagonal = Math.pow(length, 2) + Math.pow(width, 2);
        double diagonalFinal = Math.sqrt(diagonal);

        DecimalFormat df2 = new DecimalFormat("0.00");
        df2.setGroupingUsed(true);
        df2.setGroupingSize(3);

        System.out.println("\nArea      : " + df2.format(area));
        System.out.println("Perimeter : " + df2.format(perimeter));
        System.out.println("Diagonal  : " + df2.format(diagonalFinal));

        input.close();
    }
}