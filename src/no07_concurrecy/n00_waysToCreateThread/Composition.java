package no07_concurrecy.n00_waysToCreateThread;

public class Composition {
  public static void main(String[] args) {
    Thread thread = new Thread(() -> {
      System.out.println("Hi!");
    });
    thread.start();
  }
}
