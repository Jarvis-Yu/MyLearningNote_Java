// Keywords: stream, map, lambda, constructor, filter, reduce, Optional
// Note that: do not access a stream twice (exception)

package no05_stream;

import gadgets.OnePClass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static gadgets.CommonlyUsedValues.getListString;

public class MyStream {

  public static int doubleInt(int a) {
    return 2 * a;
  }

  public static void main(String[] args) {
    List<Integer> a0 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 6, 6, 7, 8, 9, 10));
    List<Integer> b0 =
        a0.stream() // turn it to a0 stream
            .map(MyStream::doubleInt) // use map
            .collect(Collectors.toList()); // convert back to list
    System.out.printf("Original: %s%n", a0);
    System.out.printf("Mapped Ver: %s%n", b0);

    // The follow produces b1 === b0 (in terms of the meaning of content)
    Stream<Integer> sA = a0.stream(); // this is what a .stream() returns
    List<Integer> b1 =
        sA.map(item -> item * 2) // lambda
            .collect(Collectors.toList());

    // Another example (methods can be used as well; set has .stream())
    List<String> s = new ArrayList<>(List.of("Hello", "world"));
    System.out.println(
        "%n"
            + new HashSet<>(s).stream()
                .map(String::toUpperCase)
                .map(item -> item.toLowerCase())
                .map(item -> String.format("*%s*", item))
                .collect(Collectors.toList()));

    // Converts List<Integer> to List<OnePClass> (using constructor)
    List<Integer> a1 = new ArrayList<>(List.of(1, 2, 3));
    List<OnePClass> onePClasses =
        a1.stream()
            .map(OnePClass::new)
            .collect(Collectors.toList());

    /* Using filter */
    System.out.printf("%nEven Only: %s%n",
        a0.stream()
            .filter(item -> (item % 2 == 0))
            .collect(Collectors.toList())
    );

    /* Reduction */
    System.out.printf("Product: %d%n",
        a0.stream()
            .reduce(1, (x, y) -> x * y)
    );
    System.out.printf("Concat: %s%n",
        s.stream()
            .reduce("", (x, y) -> String.format("%s, %s", x, y))
    );

    /* When we use "reduce" without identity, it returns an "Optional" which is just like Maybe in
     *   Haskell. It has methods like
     *     .isPresent()<boolean>,
     *     .get() (get value or throw exception)
     *     .orElse() (get value or return default)
     */
    System.out.printf("Concat without leading comma: %s%n",
        s.stream()
            .reduce((x, y) -> String.format("%s, %s", x, y))
            .orElse("")
    );

    /* stream to map */
    System.out.printf("%nstream to map O: %s%nstream to map %s%n",
        getListString(),
        getListString().stream()
            .collect(Collectors.toMap(
                Function.identity(), // item -> item
                String::length // item -> item.length()
            ))
    );

    /* some more Stream methods */
    Integer a2 = (int) a0.stream().dropWhile(item -> item < 3).limit(5).distinct().count();
    // -> [3, 4, 5, 6, 6, 6, 7, 8, 9, 10] -> [3, 4, 5, 6, 6] -> [3, 4, 5, 6] -> 4
  }
}
