// Keywords: primitive types, byte, short, int, long, float, double, boolean, char, +, -, *, /, %

package no00_introduction;

public class PrimitiveTypes {
  /* Primitive types stores the value directly instead of storing the address of the any class
   * They don't have methods because they are not classes
   * Here are some examples
   * Note here: 5.0 is double by default, so we need to use (float) to force it being the type float
   */
  private byte a = 1; // 8-bit signed integer
  private short b = 2; // 16-bit signed integer
  private int c = 3; // 32-bit signed two's complement integer
  private long d = 4; // 64-bit signed integer
  private float e = (float) 5.0; // single-precision 32-bit IEEE 754 floating point
  private double f = 6.0; // double-precision 64-bit IEEE 754 floating point
  private boolean g = true; // true or false
  private char h = 'h'; // a single 16-bit Unicode character

  /* You can force a number to be a particular type like this
   * In this example 5.5 is 'trunc'ed to 5
   */
  private int int0 = (int) 5.5;

  /* In the main I will show some basic calculations
   * Conclusion: +, -, *, / and %
   */
  public static void main(String[] args) {
    final int a = 1;
    final int b = 2;
    final int c = 3;
    final int d = 5;
    final int e = 7;
    final int r0 = a + b; // 3
    final int r1 = a - b; // -1
    final int r2 = b * c; // 6
    final int r3 = c / b; // 1
    final double r4 = (double) c / (double) b; // 1.500000
    final int r5 = e % c; // 1
    // "++" and "--" is skipped
    System.out.println(String.format("a = %d; b = %d; c = %d; d = %d; e = %d", a, b, c, d, e));
    System.out.println(String.format("a + b = %d", r0));
    System.out.println(String.format("a - b = %d", r1));
    System.out.println(String.format("b * c = %d", r2));
    System.out.println(String.format("c / b = %d", r3));
    System.out.println(String.format("(double) c / (double) b = %f", r4));
    System.out.println(String.format("e %% c = %d", r5));
  }
}
