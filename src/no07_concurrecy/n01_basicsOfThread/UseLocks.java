package no07_concurrecy.n01_basicsOfThread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static java.lang.Thread.sleep;

public class UseLocks implements Runnable{

  private int counter = 0;
  private final Lock lock = new ReentrantLock();

  // Lock makes sure the part 'in the lock' is the only one in progress at all times
  @Override
  public void run() {
    lock.lock();
    try {
      System.out.println(counter++);
      sleep(100);
      System.out.println(--counter);
    } catch (InterruptedException e) {
      e.printStackTrace();
    } finally {
      lock.unlock();
    }
  }

  public static void main(String[] args) throws InterruptedException {
    UseLocks t = new UseLocks();
    List<Thread> listT = new ArrayList<>();
    final int repeatTime = 15;

    for (int i = 0; i < repeatTime; i++) {
      Thread t1 = new Thread(t);
      listT.add(t1);
      t1.start();
    }

    final int listTSize = listT.size();
    for (Thread t2 : listT) {
      t2.join();
    }
    System.out.println("End Now...");
  }

}
