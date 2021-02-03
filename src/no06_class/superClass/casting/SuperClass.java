package no06_class.superClass.casting;

/** Represents a general kind of cash. */
public class SuperClass {

  protected double cash;

  public SuperClass(double cash) {
    this.cash = cash;
  }

  public double getCash() {
    return cash;
  }

  public void changeCash(double delta) {
    cash += delta;
  }
}
