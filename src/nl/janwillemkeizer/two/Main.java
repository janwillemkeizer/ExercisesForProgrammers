package nl.janwillemkeizer.two;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the input string?");

        String input = scanner.nextLine();
        int inputLength = input.length();

        System.out.printf("%s has %d characters.", input, inputLength);

        scanner.close();
    }
}
