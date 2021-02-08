package no06_class.superClass.n02_abstract;

// Abstract allows a class to be like an interface in some methods
// If the class implements or extends sth., it doesn't need to implement all methods
//     because the class itself will be extended by another class, which will take care of
//     the remaining methods
public abstract class SuperClass {

  protected String name;

  public SuperClass(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String welcome() {
    return String.format("Hello, I'm %s.", getName());
  }

  // The abstract method needs an 'abstract' too
  protected abstract String getMood();
}
