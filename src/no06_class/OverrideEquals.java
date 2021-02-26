package no06_class;

public class OverrideEquals {

  public static void main(String[] args) {
    A a = new A(1, 2);
    A b = new A(1, 2);
    System.out.println(a.equals(b));
  }
}

class A {

  private final int a;
  private final int b;

  A(int a, int b) {
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
}
