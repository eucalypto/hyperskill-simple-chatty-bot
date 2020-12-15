package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! My name is TARS.");
        System.out.println("I was created in 2020.");
        System.out.println("Please, remind me your name.");

        var userName = scanner.next();

        System.out.printf("What a great name you have, %s!%n", userName);
    }
}
