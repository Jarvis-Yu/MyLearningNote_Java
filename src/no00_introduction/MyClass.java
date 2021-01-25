/* This shows which package the class is in
 * Classes having the same root package can use each other without import
 */
package no00_introduction;

/* Everything in Java is coded in classes
 * Every "*.class" file only contains one class which has the same name as the file
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
}
