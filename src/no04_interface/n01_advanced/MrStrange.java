package no04_interface.n01_advanced;

public class MrStrange implements InterfaceExample<MrStrange> {

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

  @Override
  public int sumHeight(MrStrange other) {
    return this.getHeight() + other.getHeight();
  }
}
