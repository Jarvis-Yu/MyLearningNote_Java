// Keywords: stream, map, lambda

package no05_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyStream {

  public static int DoubleInt(int a) {
    return 2 * a;
  }

  public static void main(String[] args) {
    List<Integer> a = new ArrayList<>(List.of(1, 2, 3));
    List<Integer> b0 =
        a.stream() // turn it to a stream
            .map(MyStream::DoubleInt) // use map
            .collect(Collectors.toList()); // convert back to list
    System.out.println(String.format("Original: %s", a));
    System.out.println(String.format("Mapped Ver: %s", b0));

    // The follow produces b1 === b0 (in terms of the meaning of content)
    Stream<Integer> sA = a.stream(); // this is what a .stream() returns
    List<Integer> b1 =
        sA.map(item -> item * 2) // lambda
            .collect(Collectors.toList());

    // Another example (methods can be used as well)
    List<String> s = new ArrayList<>(List.of("Hello", "world"));
    System.out.println(
        "\n"
            + s.stream()
                .map(String::toUpperCase)
                .map(item -> item.toLowerCase())
                .collect(Collectors.toList()));
  }
}
