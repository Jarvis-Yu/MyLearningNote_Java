package no00_introduction;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyClassTest {

  // You need to have the @Test here for some reason
  @Test
  public void getBWorks() {
    MyClass myClass = new MyClass(1, 2);
    // to be explained later; basically it tests if the two parameters are the same
    assertEquals(2, myClass.getB());
  }

  @Test
  public void toStringWorks() {
    MyClass myClass = new MyClass(1, 2);
    assertEquals("(1, 2)", myClass.toString());
  }
}
