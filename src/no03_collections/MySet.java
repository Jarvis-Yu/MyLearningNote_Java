package no03_collections;

import java.util.HashSet;
import java.util.Set;

public class MySet {

  public static void main(String[] args) {

    Set<String> names = new HashSet<>(Set.of("alice", "bob"));
    // is the same as: final var names = new HashSet<>(Set.of("alice", "bob"));

    names.add("george");
    names.add("alice");

    for (String name : names) {
      System.out.println(name);
    }
  }
}
