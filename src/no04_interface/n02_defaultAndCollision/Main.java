package no04_interface.n02_defaultAndCollision;

public class Main implements A, B{
  @Override
  public void f1() {
    System.out.println("f1");
  }

  @Override
  public void f2() {
    System.out.println("f2");
  }

  /** If you don't override this, there will be an error, because both interfaces have the default
   *      method f0.
   */
  @Override
  public int f0() {
    return A.super.f0() + B.super.f0();
  }

  public static void main(String[] args) {
    Main main = new Main();
    System.out.println(main.f());
    System.out.println(main.f0());
    main.f1();
    main.f2();
  }
}
