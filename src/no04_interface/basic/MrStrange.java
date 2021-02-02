package no04_interface.basic;

public class MrStrange implements InterfaceExample {

  private final int a;

  public MrStrange(int a) {
    this.a = a;
  }

  @Override
  public int getAge() {
    return a / 2;
  }

  @Override
  public int getWeight() {
    return a % 2;
  }

  @Override
  public int getHeight() {
    return a * 2;
  }
}
