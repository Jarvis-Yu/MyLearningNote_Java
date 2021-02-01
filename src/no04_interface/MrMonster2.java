package no04_interface;

public class MrMonster2 implements InterfaceExample2<MrMonster2> {

  private final int a;

  public MrMonster2(int a) {
    this.a = a;
  }

  @Override
  public int getAge() {
    return a * 2;
  }

  @Override
  public int getWeight() {
    return (int) Math.pow(a, 2);
  }

  @Override
  public int getHeight() {
    return (int) Math.pow(a, a);
  }

  @Override
  public int sumHeight(MrMonster2 other) {
    return this.getHeight() + other.getHeight();
  }
}
