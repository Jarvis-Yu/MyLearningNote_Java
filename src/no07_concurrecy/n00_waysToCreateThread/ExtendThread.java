package no07_concurrecy.n00_waysToCreateThread;

public class ExtendThread extends Thread{
  private int counter = 0;

  @Override
  public void run() {
    System.out.printf("Counter = %d%n", counter++);
  }

  public static void main(String[] args) {
    ExtendThread extendThread = new ExtendThread();
    extendThread.start();
    System.out.println("yes");
  }
}
