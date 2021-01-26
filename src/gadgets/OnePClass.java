package gadgets;

public class OnePClass <T> {
  private final T t;

  public OnePClass(T t) {
    this.t = t;
  }

  public T getT() {
    return t;
  }

  @Override
  public boolean equals(Object other) {
    if (this == other) {
      return true;
    } else if (!(other instanceof OnePClass)) {
      return false;
    }
    OnePClass other1 = (OnePClass) other;
    return this.t == other1.t;
  }
}
