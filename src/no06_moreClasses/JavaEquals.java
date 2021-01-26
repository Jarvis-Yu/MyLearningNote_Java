package no06_moreClasses;

import gadgets.OnePClass;

public class JavaEquals {

  public static void main(String[] args) {
    OnePClass onePClass0 = new OnePClass(1);
    OnePClass onePClass1 = new OnePClass(1);
    final boolean b0 = onePClass0 == onePClass1;
    final boolean b1 = onePClass0.equals(onePClass1);
    System.out.printf("v0 == v1: %b%nv0.equals(v1): %b%n", b0, b1);
  }
}
