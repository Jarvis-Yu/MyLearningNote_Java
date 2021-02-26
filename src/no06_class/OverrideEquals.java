package no06_class;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class OverrideEquals {

  public static void main(String[] args) {
    A a = new A(1, "2");
    A b = new A(1, "2");
    System.out.println(a.equals(b)); // .equals apply here
    System.out.println(b.equals(a)); // .equals apply here
    Set<A> s = new HashSet<>();
    s.add(a);
    System.out.println(s.contains(b)); // .hashcode apply here
  }
}

class A {

  private final int a;
  private final String b;

  A(int a, String b) {
    this.a = a;
    this.b = b;
  }

  @Override
  public boolean equals(Object object) {
    if (object == this) {
      return true;
    } else if (!(object instanceof A)) {
      return false;
    }
    A other = (A) object;
    return a == other.a && b == other.b;
  }

  @Override
  public int hashCode() {
    return a + b.hashCode();
  }

  public int anotherWayToHashCode() {
    return Objects.hash(a, b);
  }
}
