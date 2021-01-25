package no02_structures;

import gadgets.XPair;

import java.util.List;

public class BasicStructure {
  public static void main(String[] args) {
    List<XPair> xPairs = List.of(
        new XPair(1, 2),
        new XPair(2, 3),
        new XPair(3, 4)
    );
    // The following two "for"s do the same thing
    System.out.println("First For: ");
    for (int i = 0; i < xPairs.size(); i++) {
      System.out.println(xPairs.get(i));
    }
    System.out.println("Second For: ");
    for (XPair xPair : xPairs) {
      System.out.println(xPair);
    }

    // This is not the smart way to do it. Just to show how switch Function here
    System.out.println("\nswitch: ");
    for (XPair xPair : xPairs) {
      switch (xPair.getA()) {
        case 1 -> System.out.println("a is 1");
        case 2, 3 -> System.out.println("a is 2 or 3");
        default -> System.out.println("a is not 1, 2 or 3");
      }
    }

    // another application of switch
    System.out.println("\nswitch Assign: ");
    for (XPair xPair : xPairs) {
      final int x = switch (xPair.getA()) {
        case 0 -> 0;
        default -> 1;
      };
      System.out.println(String.format("a is classified as %d", x));
    }
  }
}
