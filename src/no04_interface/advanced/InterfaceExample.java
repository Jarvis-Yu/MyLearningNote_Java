package no04_interface.advanced;

public interface InterfaceExample<T extends InterfaceExample<T>> {

  int getAge();

  int getWeight();

  int getHeight();

  int sumHeight(T a);
}
