import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Diameter : ");
        double diameter = keyboard.nextDouble();

        keyboard.close();

        double radius = diameter / 2;
        double area = PI * pow(radius, 2);
        double circumference = 2 * PI * radius;

        String pattern = "###,##0.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String finalArea = decimalFormat.format(area);
        String finalCircumference = decimalFormat.format(circumference);

        System.out.print("\nArea          : " + finalArea + "\nCircumference : " + finalCircumference + "\n");

    }
}