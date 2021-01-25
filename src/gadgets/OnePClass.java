package gadgets;

public class OnePClass <T> {
  private final T t;

  public OnePClass(T t) {
    this.t = t;
  }

  public T getT() {
    return t;
  }
}
