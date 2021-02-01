package no04_interface;

public class Main2 {

  public static int averageHeight(InterfaceExample2<MrMonster2> a, InterfaceExample2<MrStrange2> b) {
    return (a.getHeight() + b.getHeight()) / 2;
  }

  public static void main(String[] args) {
    MrMonster2 mrMonster = new MrMonster2(5);
    MrStrange2 mrStrange = new MrStrange2(5);
    final int a = averageHeight(mrMonster, mrStrange);
    System.out.printf(
        "mrMonster.getHeight() = %d\nmrStrange.getHeight() = %d\n a = %d%n",
        mrMonster.getHeight(), mrStrange.getHeight(), a);
  }
}
