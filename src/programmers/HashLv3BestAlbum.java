package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.junit.Test;

public class HashLv3BestAlbum {

  public static int[] solution(String[] genres, int[] plays) {
    ArrayList<Integer> answer = new ArrayList<>();

    HashMap<String, Integer> num = new HashMap<>(); // 장르별 총 개수
    HashMap<String, HashMap<Integer, Integer>> music = new HashMap<>(); // 장르에 속하는 노래 및 재생횟수
    for(int i = 0; i < plays.length; i++) {
      if(!num.containsKey(genres[i])) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(i, plays[i]);
        music.put(genres[i], map);
        num.put(genres[i], plays[i]);
      } else {
        music.get(genres[i]).put(i, plays[i]);
        num.put(genres[i], num.get(genres[i]) + plays[i]);
      }
    }

    List<String> keySet = new ArrayList(num.keySet());

    // 장르별 최대 2개라 비교가능
    Collections.sort(keySet, (s1, s2) -> num.get(s2) - (num.get(s1)));

    for(String key : keySet) {
      HashMap<Integer, Integer> map = music.get(key);
      List<Integer> genre_key = new ArrayList(map.keySet());

      Collections.sort(genre_key, (s1, s2) -> map.get(s2) - (map.get(s1)));

      answer.add(genre_key.get(0));
      if(genre_key.size() > 1)
        answer.add(genre_key.get(1));
    }

    return answer.stream().mapToInt(i -> i).toArray();
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
