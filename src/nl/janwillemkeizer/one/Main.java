package nl.janwillemkeizer.one;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your name?");

        String name = scanner.nextLine();

        System.out.println("Hello, " + name + ", nice to meet you!");

        scanner.close();
    }
}
