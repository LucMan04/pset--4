package src;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Inches : ");
        double givenInches = keyboard.nextDouble();
        keyboard.close();

        int inches = (int) givenInches;

        int miles = inches / 63360;
        int beforeFeet = inches - (miles * 63360);

        int feet = beforeFeet / 12;
        int remainingInches = beforeFeet - (feet * 12);

        System.out.print("\nMiles  : " + miles + "\nFeet   : " + feet + "\nInches : " + remainingInches + "\n");
    }
}