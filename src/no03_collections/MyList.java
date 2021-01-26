package no03_collections;

import java.util.ArrayList;
import java.util.List;

public class MyList {

  public static void main(String[] args){
    // This creates a immutable list
    // final var names = new List.of("alice", "bob");

    List<String> names = new ArrayList<>(List.of("alice", "bob"));
    // final var = List<String>
    /* A number of kind of lists
     * ArrayList
     * LinkedList
     */

    names.add("george");

    for (String name : names) {
      System.out.println(name);
    }
  }
}
