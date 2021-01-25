/* This shows which package the class is in
 * Classes having the same root package can use each other without import
 */
package no00_introduction;

/* Everything in Java is coded in classes
 * Every "*.class" file only contains one class which has the same name as the file
 * The class should have describe the object well
 */
public class MyClass {

  /* This properties in Java is defined in this way
   * "private" means this cannot be accessed outside the class
   * "final" means this cannot be changed once set
   * "Integer" means the variable is of type Integer which is a class
   * "a" is the name of the variable
   */
  private final Integer a;
  private Integer b;

  /* It is the constructor of the class
   * It takes two parameters "a" and "b" of the same type Integer
   * And assign them to the properties of the class
   * "public" means the method can be used by anyone
   * "this" indicates that we are referring to the properties of the class instead of the parameters
   */
  public MyClass(Integer a, Integer b) {
    this.a = a;
    this.b = b;
  }

  // This is a method which returns the sum of a and b
  public int sum() {
    return a.intValue() + b.intValue();
  }

  /* "static" makes it a function which just take parameters and execute without referring to any
   *   'main' class
   */
  public static int sumOfTwoMyClass(MyClass a, MyClass b) {
    return a.sum() + b.sum();
  }

  /* In OOP(object-oriented programming), it is always good to use set and get methods if you do
   *   wish other people can change the class directly. There is a reason for that.
   */
  // "void" means this method returns no value
  public void setB(Integer b) {
    this.b = b;
  }

  // "int" means this method returns a int
  public int getA() {
    return a.intValue();
  }

  public int getB() {
    return b.intValue();
  }

  // "@Override" indicates we are overwriting preexist method by default
  @Override
  public String toString() {
    return String.format("(%d, %d)", a, b);
  }

  public static void main(String[] args) {
    MyClass myClass0 = new MyClass(1, 2);
    MyClass myClass1 = new MyClass(3, 4);
    final int i0 = myClass0.sum();  // 3
    final int i1 = sumOfTwoMyClass(myClass0, myClass1); // 10
    System.out.print(String.format("myClass0 = %s; ", myClass0.toString()));
    System.out.println(String.format("myClass1 = %s", myClass1.toString()));
    System.out.println(String.format("myClass0.sum() = %d", i0));
    System.out.println(String.format("sumOfTwoMyClass(myClass0, myClass1) = %d", i1));
  }
}
