package no04_interface.advanced;

public class Main {

  public static int averageHeight(InterfaceExample<MrMonster> a, InterfaceExample<MrStrange> b) {
    return (a.getHeight() + b.getHeight()) / 2;
  }

  public static void main(String[] args) {
    MrMonster mrMonster = new MrMonster(5);
    MrStrange mrStrange = new MrStrange(5);
    final int a = averageHeight(mrMonster, mrStrange);
    System.out.printf(
        "mrMonster.getHeight() = %d\nmrStrange.getHeight() = %d\n a = %d%n",
        mrMonster.getHeight(), mrStrange.getHeight(), a);
  }
}
