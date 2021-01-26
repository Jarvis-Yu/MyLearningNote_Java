package gadgets;

import java.util.ArrayList;
import java.util.List;

public class CommonlyUsedValues {

  public static List<Integer> getListInteger(int n) {
    List<Integer> a = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      a.add(i);
    }
    return a;
  }

  public static List<Integer> getListPrime(int n) {
    List<Integer> a = new ArrayList<>();
    for (int i = 2; i <= n; i++) {
      a.add(i);
    }
    for (int i = 2; i <= n / 2; i++) {
      for (int j = 2 * i; j <= n; j+=i) {
        if (a.contains(j)) {
          a.remove(j);
        }
      }
    }
    return a;
  }

  public static List<String> getListString() {
    return new ArrayList<>(List.of("Marry", "has", "a", "sheep"));
  }
}
