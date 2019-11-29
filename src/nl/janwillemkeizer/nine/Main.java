package nl.janwillemkeizer.nine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's the length of the ceiling?");
        int ceilingLength = scanner.nextInt();

        System.out.println("What's the width of the ceiling?");
        int ceilingWidth = scanner.nextInt();

        final int CONVERSION = 350;

        int squareFeet = ceilingLength * ceilingWidth;

        int roundedCalculatedGallons = (int) Math.ceil((double) squareFeet / CONVERSION);

        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet", roundedCalculatedGallons,
                squareFeet);
    }
}
