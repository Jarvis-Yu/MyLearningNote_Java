package no04_interface.n02_defaultAndCollision;

public interface B {

  public void f1();

  public void f2();

  public default int f0() {
    return 100;
  }
}
