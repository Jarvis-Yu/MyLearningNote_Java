package no07_superClass;

public class Main {

  public static void main(String[] args) {
    System.out.printf("SubClass x = new SubClass(4, 5, 6);%n");
    SubClass subClass0 = new SubClass(4, 5, 6);

    System.out.printf("x.getCor0() = %d%n", subClass0.getCor0());
    subClass0.sumAB();
    subClass0.hello();

    System.out.printf("%nSuperClass x = new SubClass(4, 5, 6);%n");

    /* You may also do this, but methods from SubClass will not be available
     * "SuperClass" here is 'apparent type'
     * "SubClass" here is 'actual type'
     */
    SuperClass subClass1 = new SubClass(4, 5, 6);
    subClass1.hello();
    /* Note this one, you can call the sumAB in SubClass because SuperClass has a method of the same
     * name, so it doesn't raise compile error. But in runtime, it actually calls SubClass.sumAB().
     * subClass1.getCor0() cannot be called, because it is not a method in SuperClass
     */
    subClass1.sumAB();
  }
}
