// Keywords: stream, map, lambda

package no05_stream;

import gadgets.OnePClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyStream {

  public static int DoubleInt(int a) {
    return 2 * a;
  }

  public static void main(String[] args) {
    List<Integer> a0 = new ArrayList<>(List.of(1, 2, 3));
    List<Integer> b0 =
        a0.stream() // turn it to a0 stream
            .map(MyStream::DoubleInt) // use map
            .collect(Collectors.toList()); // convert back to list
    System.out.println(String.format("Original: %s", a0));
    System.out.println(String.format("Mapped Ver: %s", b0));

    // The follow produces b1 === b0 (in terms of the meaning of content)
    Stream<Integer> sA = a0.stream(); // this is what a .stream() returns
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

    // converts List<Integer> to List<OnePClass> (using new)
    List<Integer> a1 = new ArrayList<>(List.of(1, 2, 3));
    List<OnePClass> onePClasses =
        a1.stream()
            .map(OnePClass::new)
            .collect(Collectors.toList());
  }
}
