package no04_interface.n02_defaultAndCollision;

public interface A {

  public void f1();

  public default int f0() {
    return 10;
  }

  public default int f() {
    return 1;
  }
}
