package nl.janwillemkeizer.five;

import java.util.Scanner;

/*
You’ll often write programs that deal with numbers. And depending on the programming language you use, you’ll have to
convert the inputs you get to numerical data types.

Write a program that prompts for two numbers. Print the sum, difference, product, and quotient of those numbers as
shown in the example output:

Example Output
What is the first number? 10
What is the second number? 5
10 + 5 = 15
10 - 5 = 5
10 * 5 = 50
10 / 5 = 2

Constraints
• Values coming from users will be strings. Ensure that you convert these values to numbers before doing the math.
• Keep the inputs and outputs separate from the numerical conversions and other processing.
• Generate a single output statement with line breaks in the appropriate spots.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the first number?");
        int firstNumber = scanner.nextInt();

        System.out.println("What is the second number?");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int minus = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;
        int quotient = firstNumber / secondNumber;

        // How to DRY?
        System.out.printf("%s + %s = %s\n%s + %s = %s\n%s + %s = %s\n%s + %s = %s", firstNumber, secondNumber, sum,
                firstNumber, secondNumber, minus, firstNumber, secondNumber, product, firstNumber, secondNumber,
                quotient);
    }
}
