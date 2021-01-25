package no003_collections;

import java.util.HashMap;
import java.util.Map;

public class myMap {

  public static void main(String[] args) {
    // final var namesToAges = Map.of("alice", 22, "bob", 20);

    Map<String, Integer> namesToAges = new HashMap<>();
    // is the same as: final var namesToAges = new HashMap<String, Integer>();

    namesToAges.put("alice", 22);
    namesToAges.put("bob", 20);

    System.out.println("Alice's age is: " + namesToAges.get("alice"));
  }
}
