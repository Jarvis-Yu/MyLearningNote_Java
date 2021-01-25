package no00_introduction;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MyClassTest {

  // You need to have the @Test here for some reason
  @Test
  public void haveTheCorrectBValue() {
    MyClass myClass = new MyClass(1, 2);
    // to be explained later; basically it tests if the two parameters are the same
    assertEquals(2, myClass.getB());
  }
}
