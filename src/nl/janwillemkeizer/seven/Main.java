package nl.janwillemkeizer.seven;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final float conversionFactor = 0.09290304f;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the length of the room in feet?");
        int lenghtInFeet = scanner.nextInt();

        System.out.println("What is the width of the room in feet?");
        int widthInFeet = scanner.nextInt();

        int squareFeet = lenghtInFeet * widthInFeet;
        float squareMeters = squareFeet * conversionFactor;

        System.out.printf("You entered dimensions of %d feet by %d feet.\n", lenghtInFeet, widthInFeet);
        System.out.printf("The area is\n%d square feet \n%.3f square meters", squareFeet, squareMeters);

        scanner.close();
    }
}
