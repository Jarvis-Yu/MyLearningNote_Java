package no06_class.superClass.casting;

public class Main {

  public static void main(String[] args) {
    SuperClass myClass = new SubClass(100, 10);

    // I know clearly myClass is actually a SubClass
    // To use methods in SubClass, we need to downcast
    ((SubClass) myClass).getActualValue();
    // Casting is not recommended, if you met problems like this, you should try a better design
  }



}
