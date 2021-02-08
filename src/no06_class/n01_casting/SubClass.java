package no06_class.n01_casting;

public class SubClass extends SuperClass{

  // value in terms of Primogems (a kind of imaginary currency)
  private final double standardValue;

  public SubClass(double cash, double standardValue) {
    super(cash);
    this.standardValue = standardValue;
  }

  public void getActualValue() {
    System.out.println(super.cash * standardValue);
  }

}
