package src;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("First name  : ");
        String first = input.nextLine();
        first = first.toUpperCase();

        System.out.print("Middle name : ");
        String middle = input.nextLine();
        middle = middle.toUpperCase();

        System.out.print("Last name   : ");
        String last = input.nextLine();
        last = last.toUpperCase();

        System.out.println("\n" + first.substring(0 , 1) + middle.substring(0 ,1) + last.substring(0 , 1) + ".");

        input.close();
    }
}