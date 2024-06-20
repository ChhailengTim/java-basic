package demo.com;  // Ensure this matches your directory structure

import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();

        System.out.println("Enter your age:");
        int age = scanner.nextInt();

        System.out.println("Your name: " + name);
        System.out.println("Your age: " + age);
    }
}
