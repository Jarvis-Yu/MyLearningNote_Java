package no09_functions.n01_comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.lang.Math.random;

public class Example {
  public static void main(String[] args){
    final int size = 10;
    final int range = 100;

    Comparator<Integer> comparator = (int1, int2) -> {
      return (int1 % 10) - (int2 % 10);
    };

    List<Integer> ints = new ArrayList<>();
    for (int i = 0; i < size; i++) {
      ints.add((int) (random() * range));
    }

    System.out.println(ints);

    ints.sort(comparator);

    System.out.println(ints);

    ints.sort((int1, int2) -> {
      return int1 - int2;
    });

    System.out.println(ints);
  }
}
