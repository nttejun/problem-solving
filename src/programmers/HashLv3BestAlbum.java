package programmers;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.junit.Test;

public class HashLv3BestAlbum {

  public static int[] solution(String[] genres, int[] plays) {
    int[] answer = new int[genres.length];
    String[] genresUnique = new String[genres.length];

    Map<String, Integer> genresKey = new HashMap<>();
    Map<String, Integer> uniqueNumberKey = new HashMap<>();

    for (int i = 0; i < genres.length; i++) {
      genresKey.put(genres[i] + i, plays[i]);
      uniqueNumberKey.put(genres[i] + i, i);
      genresUnique[i] = genres[i] + i;
    }

    List<Map.Entry<String, Integer>> genresKeyList = new LinkedList<>(genresKey.entrySet());
    genresKeyList.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

    List<Map.Entry<String, Integer>> uniqueNumberKeyList = new LinkedList<>(
        uniqueNumberKey.entrySet());
    uniqueNumberKeyList.sort(Map.Entry.comparingByValue());

    for (int i = 0; i < genresKeyList.size() - 1; i++) {

      Map<String, Integer> sameList = new HashMap<>();
      int j = i;
      int pass = 0;

      while (genresKeyList.get(j + 1) != null && genresKeyList.get(i).getValue() == genresKeyList
          .get(j + 1).getValue()) {
        sameList.put(genresKeyList.get(j + 1).getKey(),
            uniqueNumberKey.get(genresKeyList.get(j + 1).getKey()));
        j++;
        pass++;
      }

      if (pass != 0) {
        sameList
            .put(genresKeyList.get(i).getKey(), uniqueNumberKey.get(genresKeyList.get(i).getKey()));

        List<Map.Entry<String, Integer>> sameKeyList = new LinkedList<>(sameList.entrySet());
        sameKeyList.sort(Map.Entry.comparingByValue());

        for (int k = 0; k < sameKeyList.size(); k++) {
          answer[i + k] = sameKeyList.get(k).getValue();
        }

        i += pass;
        sameList.clear();
      } else {
        answer[i] = uniqueNumberKey.get(i);
      }
    }

    return answer;
  }


  @Test
  public void TEST_성공케이스() {
    String[] genres = new String[]{"classic", "pop", "classic", "classic", "pop"};
    int[] plays = new int[]{500, 600, 150, 800, 2500};
    for (int i : HashLv3BestAlbum.solution(genres, plays)) {
      System.out.println(i);
    }
  }
}
