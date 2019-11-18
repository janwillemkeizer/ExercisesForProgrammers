package nl.janwillemkeizer.seven;

/*
When working in a global environment, you’ll have to present information in both metric and Imperial units.
And you’ll need to know when to do the conversion to ensure the most accurate results.
Create a program that calculates the area of a room. Prompt the user for the length and width of the room in feet.
Then display the area in both square feet and square meters.

Example Output
What is the length of the room in feet? 15
What is the width of the room in feet? 20
You entered dimensions of 15 feet by 20 feet.
The area is
300 square feet
27.871 square meters

The formula for this conversion is
m2 = f2 × 0.09290304

Constraints
• Keep the calculations separate from the output.
• Use a constant to hold the conversion factor.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final float conversionFactor = 0.09290304f;

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the length of the room in feet?");
        int lengthInFeet = scanner.nextInt();

        System.out.println("What is the width of the room in feet?");
        int widthInFeet = scanner.nextInt();

        int squareFeet = lengthInFeet * widthInFeet;
        float squareMeters = squareFeet * conversionFactor;

        System.out.printf("You entered dimensions of %d feet by %d feet.\n", lengthInFeet, widthInFeet);
        System.out.printf("The area is\n%d square feet \n%.3f square meters", squareFeet, squareMeters);

        scanner.close();
    }
}
