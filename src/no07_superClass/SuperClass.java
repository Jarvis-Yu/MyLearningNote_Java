package no07_superClass;

public class SuperClass {

  /* "private" properties is not visible in subClasses
   * "protected" properties is visible in subClasses and this class only
   */
  private final int a;
  protected final int b;

  public SuperClass(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public int getA() {
    return a;
  }

  public int getB() {
    return b;
  }

  public void sumAB() {
    System.out.printf("SuperClass: %d + %d = %d%n", a, b, a + b);
  }

  public void hello() {
    System.out.printf("SuperClass: %d and %d say hello to you!%n", a, b);
  }
}
