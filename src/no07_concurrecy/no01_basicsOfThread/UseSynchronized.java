package no07_concurrecy.no01_basicsOfThread;

public class UseSynchronized implements Runnable{
  private int counter = 0;
  private static final int REPEAT_TIME = 10000;

  // 'synchronized' turn the whole method "locked"
  @Override
  public synchronized void run() {
    for (int i = 0; i < REPEAT_TIME; i++) {
      counter++;
    }
  }


//  //You may also use it in blocks
//  @Override
//  public void run() {
//    synchronized (this) { // 'this' can be replaced by other visible objects
//      for (int i = 0; i < REPEAT_TIME; i++) {
//        counter++;
//      }
//    }
//  }

  public int getCounter() {
    return counter;
  }

  public static void main(String[] args) {
    UseSynchronized t0 = new UseSynchronized();
    Thread t = new Thread(t0);
    Thread u = new Thread(t0);

    t.start();
    u.start();

    try {
      t.join();
      u.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(t0.getCounter());
  }
}
