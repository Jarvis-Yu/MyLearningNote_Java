package no06_class.superClass.n02_abstract;

public class SubClass extends SuperClass{

  private String mood;

  public SubClass(String name, String mood) {
    super(name);
    this.mood = mood;
  }

  @Override
  public String welcome() {
    return String.format("%s I'm %s now!", super.welcome(), mood);
  }

  @Override
  protected String getMood() {
    return mood;
  }
}
