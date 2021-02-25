package no04_interface.n01_advanced;

public class MrMonster implements InterfaceExample<MrMonster> {

  private final int a;

  public MrMonster(int a) {
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
  public int sumHeight(MrMonster other) {
    return this.getHeight() + other.getHeight();
  }
}
