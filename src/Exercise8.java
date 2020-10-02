package src;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text;

        System.out.print("Text : ");
        text = input.nextLine();
        text = text.toUpperCase();

        System.out.print("\n" + text.substring(text.length() / 2) + text.substring(0 , text.length() / 2 ) + ".");

        input.close();
    }
}