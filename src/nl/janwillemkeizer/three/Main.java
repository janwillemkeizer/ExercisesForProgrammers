package nl.janwillemkeizer.three;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the quote?");

        String quote = scanner.nextLine();

        System.out.println("Who said it?");

        String quotee = scanner.nextLine();

        System.out.printf("%s says, \"" + quote + "\"", quotee);

        scanner.close();
    }
}
