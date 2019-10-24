package nl.janwillemkeizer.four;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a noun: ");
        String noun = scanner.nextLine();

        System.out.println("Enter a verb: ");
        String verb = scanner.nextLine();

        System.out.println("Enter a adjective: ");
        String adjective = scanner.nextLine();

        System.out.println("Enter a adverb: ");
        String adverb = scanner.nextLine();

        System.out.printf("Do you %s your %s %s %s? That's hilarious!",
                verb, adjective, noun, adverb);

    }
}
