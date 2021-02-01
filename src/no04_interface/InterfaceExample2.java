package no04_interface;

public interface InterfaceExample2<T extends InterfaceExample2<T>> {

  int getAge();

  int getWeight();

  int getHeight();

  int sumHeight(T a);
}
