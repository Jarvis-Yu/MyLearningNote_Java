package no04_interface;

public class MrStrange2 implements InterfaceExample2<MrMonster2> {

  private final int a;

  public MrStrange2(int a) {
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
  public int sumHeight(MrMonster2 other) {
    return this.getHeight() + other.getHeight();
  }
}
