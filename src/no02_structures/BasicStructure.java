package no02_structures;

import gadgets.XIPair;

import java.util.List;

public class BasicStructure {

  public static void main(String[] args) {
    List<XIPair> xIPairs = List.of(
        new XIPair(1, 2),
        new XIPair(2, 3),
        new XIPair(3, 4)
    );
    // The following two "for"s do the same thing
    System.out.println("First For: ");
    for (int i = 0; i < xIPairs.size(); i++) {
      System.out.println(xIPairs.get(i));
    }
    System.out.println("Second For: ");
    for (XIPair xIPair : xIPairs) {
      System.out.println(xIPair);
    }

    // This is not the smart way to do it. Just to show how switch Function here
    System.out.println("\nswitch: ");
    for (XIPair xIPair : xIPairs) {
      switch (xIPair.getA()) {
        case 1 -> System.out.println("a is 1");
        case 2, 3 -> System.out.println("a is 2 or 3");
        default -> System.out.println("a is not 1, 2 or 3");
      }
    }

    // another application of switch
    System.out.println("\nswitch Assign: ");
    for (XIPair xIPair : xIPairs) {
      final int x = switch (xIPair.getA()) {
        case 0 -> 0;
        default -> 1;
      };
      System.out.println(String.format("a is classified as %d", x));
    }
  }
}
