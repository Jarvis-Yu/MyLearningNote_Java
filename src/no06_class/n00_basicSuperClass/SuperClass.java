package no06_class.n00_basicSuperClass;

public class SuperClass {

  /* "private" property is not visible in subClasses
   * "protected" property is visible in subClasses and this class only
   * "package" property is visible in the same package ".%/" but not in ".%/*%/"
   * "public" property is visible to all
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
