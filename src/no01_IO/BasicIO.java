package no01_IO;

import java.util.Scanner;

public class BasicIO {

  public static void main(String[] args) {
    System.out.println("Enter the two numbers you want me to guess: ");
    final var scanner = new Scanner(System.in);
    final int x = scanner.nextInt();
    final int y = scanner.nextInt();
    System.out.println(String.format("\n\nSee! Are %d and %d the numbers you want me to guess? " +
        "I am a genius!", x, y));
  }
}
