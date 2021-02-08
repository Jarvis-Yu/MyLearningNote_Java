package no07_concurrecy.no00_waysToCreateThread;

public class ImplementRunnable implements Runnable{

  private int counter = 0;

  @Override
  public void run() {
    System.out.printf("counter = %d%n", counter++);
  }

  public static void main(String[] args) {
    ImplementRunnable implementRunnable = new ImplementRunnable();
    Thread t = new Thread(implementRunnable);
    t.run();
  }
}
