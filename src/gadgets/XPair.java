package gadgets;

public class XPair {

  private final int a;
  private final int b;

  public XPair(int a, int b) {
    this.a = a;
    this.b = b;
  }

  public int getA() {
    return a;
  }

  public int getB() {
    return b;
  }

  @Override
  public String toString() {
    return String.format("(%d, %d)", a, b);
  }
}
