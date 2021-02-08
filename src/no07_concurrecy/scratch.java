package no07_concurrecy;

import java.util.ArrayList;
import java.util.List;

public class scratch implements Runnable{

  private int counter = 0;

  @Override
  public void run(){
    System.out.printf("%d: Yes!%n", counter++);
  }

  public static void main(String[] args) {
    List<String> ss = new ArrayList<>(List.of("abc", "efg", "hi"));
    scratch s = new scratch();
    for (int i = 0; i < ss.size(); i ++) {
      Thread t = new Thread(s);
      t.run();
    }
  }
}
