package programmers;

import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

public class Lv1RunningRace {

  //https://school.programmers.co.kr/learn/courses/30/lessons/178871
  @Test
  public void TEST_RUNNING_RACE() {
    String[] players = {"mumu", "soe", "poe", "kai", "mine"};
    String[] callings = {"kai", "kai", "mine", "mine"};

    Map<Integer, String> list = new HashMap<>();
    for (int i = 0; i < players.length; i++) {
      list.put(i, players[i]);
    }

    for (String call : callings) {
      for (int j = 0; j < list.size(); j++) {
        if (call.equals(list.get(0))) {
          continue;
        }

        if (call.equals(list.get(j))) {
          String temp = list.get(j - 1);
          list.put(j - 1, list.get(j));
          list.put(j, temp);
        }
      }
    }

    String[] answer = list.values().toArray(new String[0]);
    System.out.println(String.join(", ", answer));
  }
}
