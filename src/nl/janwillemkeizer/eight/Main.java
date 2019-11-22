package nl.janwillemkeizer.eight;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int people;
        int pizzas;
        int slicesPerPizza;
        int totalSlices;
        boolean unevenSlices;

        System.out.println("How many people?");
        people = scanner.nextInt();

        do {
            unevenSlices = false;

            System.out.println("How many pizza's do you have?");
            pizzas = scanner.nextInt();

            System.out.println("How many slices per pizza?");
            slicesPerPizza = scanner.nextInt();

            totalSlices = slicesPerPizza * pizzas;

            // How to DRY?
            if (totalSlices % 2 != 0) {
                System.out.println("Please enter an even amount of total slices.");
                unevenSlices = true;
            }

        } while (unevenSlices);

        int pizzaPerPerson = (int) Math.ceil((totalSlices) / people);
        int leftOvers = (pizzas * slicesPerPizza) % people;

        System.out.printf("%d people with %d pizzas\n", people, pizzas);
        System.out.printf("Each person gets %d pieces of pizza.\n", pizzaPerPerson);
        System.out.printf("There are %d leftover pieces.", leftOvers);

        scanner.close();
    }
}
