package no04_interface;

public class MrMonster implements InterfaceExample {

  private final int a;

  public MrMonster(int a) {
    this.a = a;
  }

  public int getAge() {
    return a * 2;
  }

  public int getWeight() {
    return (int) Math.pow(a, 2);
  }

  public int getHeight() {
    return (int) Math.pow(a, a);
  }
}
