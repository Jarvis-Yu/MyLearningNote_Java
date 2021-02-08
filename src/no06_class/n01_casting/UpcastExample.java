package no06_class.n01_casting;

public class UpcastExample {

  private final SuperClass myClass;

  public UpcastExample(SuperClass myClass) {
    this.myClass = myClass;
  }

  public double getCash() {
    return myClass.getCash();
  }

  // Upcast always succeed
  public void makeItFromSubClass() {
    UpcastExample c = new UpcastExample(new SubClass(100, 10));
    System.out.println(c.getCash());
  }
}
