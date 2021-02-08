package no06_class.superClass.n02_abstract;

public class Main {

  public static void main(String[] args) {

    SubClass subClass = new SubClass("Jarvis", "happy");

    System.out.println(subClass.welcome());
  }
}
