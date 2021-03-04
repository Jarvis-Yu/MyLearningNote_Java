package no09_functions.n03_function;

import java.util.function.Function;

public class Example {
  public static void main(String[] args) {
    Function<Integer, Integer> f1 = int1 -> int1 * 2;

    Function<Integer, String> f2 = String::valueOf;

    Function<Integer, String> f3 = int1 -> {
      int i = int1;
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(String.valueOf(i++));
      stringBuilder.append(String.valueOf(i++));
      stringBuilder.append(String.valueOf(i++));
      return stringBuilder.toString();
    };

    final int a = 7;

    System.out.println(f1.apply(a).equals(14));
    System.out.println(f2.apply(a).equals("7"));
    System.out.println(f2.compose(f1).apply(a).equals("14"));
    System.out.println(f3.apply(a));
  }
}
