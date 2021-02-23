package no07_concurrecy.n01_basicsOfThread.n00_lock.hashLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Individual {

  private int wallet;
  private final Lock lock = new ReentrantLock();

  public Individual(int wallet) {
    this.wallet = wallet;
  }

  public void addWallet(int delta) {
    wallet += delta;
  }

  public Lock getLock() {
    return lock;
  }

  public int getWallet() {
    return wallet;
  }

  public void giveMoneyTo(Individual other, int amount) {
    Lock lock1, lock2;
    if (lock.hashCode() < other.lock.hashCode()) {
      lock1 = lock;
      lock2 = other.lock;
    } else {
      lock1 = other.lock;
      lock2 = lock;
    }
    lock1.lock();
    lock2.lock();
    try {
      addWallet(-amount);
      other.addWallet(amount);
    } finally {
      lock2.unlock();
      lock1.unlock();
    }
  }

  public static void main(String[] args) {
    Individual in1 = new Individual(100);
    Individual in2 = new Individual(200);
    // Suppose multiple threads call giveMoneyTo, they wait until both dealers are not involved
    //   in any giveMoneyTo
    Thread t1 = new Thread(() -> {
      in1.giveMoneyTo(in2, 100);
    });
    Thread t2 = new Thread(() -> {
      in2.giveMoneyTo(in1, 50);
    });
    t1.start();
    t2.start();
    try {
      t1.join();
      t2.join();
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.printf("in1 has %d, in2 has %d", in1.getWallet(), in2.getWallet());
  }
}
