package no06_class.n01_casting;

public class Main {

  public static void main(String[] args) {
    SuperClass myClass = new SubClass(100, 10);

    // The 'Apparent Type' of myClass is SuperClass; The 'Actual Type' is SubClass
    // To use methods of the 'Actual Type', we need to downcast
    ((SubClass) myClass).getActualValue();
    // Casting is not recommended, if you met problems like this, you should try a better design
  }



}
