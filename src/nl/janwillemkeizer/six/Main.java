package nl.janwillemkeizer.six;

/*

Create a program that determines how many years you have left until retirement
and the year you can retire.

It should prompt for your current age and the age you want to retire
and display the output as shown in the example that follows.

Example Output
What is your current age? 25
At what age would you like to retire? 65
You have 40 years left until you can retire.
It's 2015, so you can retire in 2055.

 */

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your current age?");
        int currentAge = scanner.nextInt();

        System.out.println("At what age would you like to retire?");
        int retirementAge = scanner.nextInt();

        int yearsLeft = retirementAge - currentAge;

        int currentYear = LocalDate.now().getYear();

        int retirementYear = currentYear + yearsLeft;

        System.out.printf("You have %d years left until you can retire.\n", yearsLeft);
        System.out.printf("It's %d, so you can retire in %d.", currentYear, retirementYear);

        scanner.close();
    }
}
