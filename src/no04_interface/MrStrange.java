package no04_interface;

public class MrStrange implements InterfaceExample {

  private final int a;

  public MrStrange(int a) {
    this.a = a;
  }

  public int getAge() {
    return a / 2;
  }

  public int getWeight() {
    return a % 2;
  }

  public int getHeight() {
    return a * 2;
  }
}
