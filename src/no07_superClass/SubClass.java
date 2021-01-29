package no07_superClass;

/* "extends" show the using of 'super class'
 * Methods from super class can be used in subclasses as well as protected properties
 * Methods in super class can be '@Override'd
 */
public class SubClass extends SuperClass{

  private final int c;

  // the super class needs to be constructed first using "super()"
  public SubClass(int a, int b, int c) {
    super(a, b);
    this.c = c;
  }

  // Since a is private, it cannot be accessed directly
  public int getCor0() {
    return (super.getA() * b > 15) ? c : 0;
  }

  @Override
  public void sumAB() {
    System.out.printf("SubClass: Nope! I won't tell you!%n2");
  }

}
