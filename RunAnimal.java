package runanimal;

import java.util.Scanner;

public class RunAnimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an animal. Press B for Bird, C for Cat, or D for Dog: ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("B")) {
            Bird b = new Bird();
            b.eatsleep();
            b.makeSound();
            
        } else if (choice.equalsIgnoreCase("C")) {
            Cat c = new Cat();
        } else if (choice.equalsIgnoreCase("D")) {
            Dog d = new Dog();
        } else {
            System.out.println("Invalid choice.");
            System.exit(0);
        }

    }
}
