package no07_concurrecy.n01_avoidRaceCondition.n02_atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Example {

  private AtomicInteger k;

  public Example(AtomicInteger k) {
    this.k = k;
  }

  public int compute(int tmp) {
    return ++tmp;
  }
  public void update() {
    int oldValue, newValue;
    // .compareAndSet is atomic, which means it cannot be interrupted by any means;
    //   if 'oldValue' is equals to k, k is set to newValue and return true;
    //   otherwise, return false
    do {
      oldValue = k.get();
      newValue = compute(oldValue);
    } while (!k.compareAndSet(oldValue, newValue));
  }
}
