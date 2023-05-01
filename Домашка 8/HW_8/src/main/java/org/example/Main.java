package org.example;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a size (SMALL, MEDIUM, LARGE, or EXTRA_LARGE):");
            String input = scanner.nextLine().toUpperCase();

            Size size;
            switch (input) {
                case "SMALL" -> size = Size.SMALL;
                case "MEDIUM" -> size = Size.MEDIUM;
                case "LARGE" -> size = Size.LARGE;
                case "EXTRA_LARGE" -> size = Size.EXTRA_LARGE;
                default -> {
                    System.out.println("Invalid input!");
                    return;
                }
            }

            System.out.println("Selected size: " + size + "eeee");
            System.out.println("Abbreviation: " + size.getAbbreviation());
            System.out.println("Width: " + size.getWidth());
            System.out.println("Length: " + size.getLength());
        }
}


