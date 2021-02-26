package no06_class.n01_casting;

import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class InstanceOf {

  public static void main(String[] args) {
    A a1 = new A(5);
    A a2 = new A(5);
    A a3 = new A(7);

    System.out.println(a1.equals(a2));
    System.out.println(a1.equals(a3));

    Object o = List.of(1, 2);

    System.out.println(o instanceof Object);
    System.out.println(o instanceof List);
  }
}

class A {
  private final int a;

  A(int a) {
    this.a = a;
  }

  public int getA() {
    return a;
  }

  @Override
  public boolean equals(Object object) {
    if (object == this) {
      return true;
    } else if (!(object instanceof A)) {
      return false;
    }
    A other = (A) object;
    return this.a == other.a;
  }

  @Override
  public int hashCode() {
    return a;
  }
}