package no003_collections;

import java.util.ArrayList;
import java.util.List;

public class myList {

  public static void main(String[] args){
    // This creates a immutable list
    // final var names = new List.of("alice", "bob");

    List<String> names = new ArrayList<>(List.of("alice", "bob"));
    // final var = List<String>

    names.add("george");

    for (String name : names) {
      System.out.println(name);
    }
  }
}
