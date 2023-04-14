package programmers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
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

  private static Map<String, Integer> playerInfo = new HashMap<>();

  public String[] solution(String[] players, String[] callings) {
    makeInfo(players);

    Arrays.stream(callings).forEach(player -> {
      int index = playerInfo.get(player);
      String frontPlayer = players[index -1];
      players[index] = frontPlayer;
      players[index-1] = player;

      playerInfo.put(frontPlayer, index);
      playerInfo.put(player, index-1);
    });

    return players;
  }

  private void makeInfo(String[] players) {
    IntStream.range(0, players.length).forEach(index -> {
      playerInfo.put(players[index], index);
    });
  }

  public static void main(String[] args) {
    Lv1RunningRace lv1RunningRace = new Lv1RunningRace();
    String[] players = {"mumu", "soe", "poe", "kai", "mine"};
    String[] callings = {"kai", "kai", "mine", "mine"};
    lv1RunningRace.solution(players, callings);
  }
}
