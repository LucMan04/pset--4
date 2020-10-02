package src;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What's your favorite city? ");
        String city = input.nextLine();

        System.out.println("\nText   : " + city);
        System.out.println("Length : " + city.length());
        city = city.toUpperCase();
        System.out.println("Upper  : " + city);
        city = city.toLowerCase();
        System.out.println("Lower  : " + city);

        input.close();
    }
}