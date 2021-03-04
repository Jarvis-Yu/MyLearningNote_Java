package no09_functions.n00_whammer;

public class Example {
  public static void B() {
    System.out.println("B");
  }

  // The ... means you can pass in any num of Whammer as an array
  public static void whamAll(Whammer... whammers) {
    for (Whammer whammer : whammers) {
      whammer.wham();
    }
  }

  public static void main(String[] args) {
    Whammer C = () -> {
      System.out.println("C");
    };

    whamAll(Example::B, C);
  }
}

interface Whammer {
  void wham();
}