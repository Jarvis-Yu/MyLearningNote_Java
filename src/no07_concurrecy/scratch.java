package no07_concurrecy;

import java.util.ArrayList;
import java.util.List;

public class scratch implements Runnable{

  @Override
  public void run(){
    System.out.println("Yes!");
  }

  public static void main(String[] args) {
    List<String> ss = new ArrayList<>(List.of("abc", "efg", "hi"));
    for (int i = 0; i < ss.size(); i ++) {
      Thread t = new Thread(new scratch());
      t.run();
    }
  }
}
