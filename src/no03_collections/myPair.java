package no003_collections;

public class myPair<T, U> {

  private final T first;
  private final U second;

  public myPair(T first, U second) {
    this.first = first;
    this.second = second;
  }

  public static <T, U> myPair<T, U> of(T first, U second) {
    return new myPair<>(first, second);
  }

  public T getA() {
    return first;
  }

  public U getB() {
    return second;
  }

  @Override
  public String toString() {
    return String.format("(%d, %d)", first, second);
  }
}
