package programmers;


import java.util.HashMap;
import java.util.Map;
import org.junit.Test;

// N/2 개를 선택할 수 있는 최대 경우의수
// https://school.programmers.co.kr/learn/courses/30/lessons/1845
public class HashLv1Pocketmon {

  @Test
  public int 포켓몬() {
    int[] nums = new int[]{3, 1, 2, 3};
    int n = nums.length / 2;

    Map<String, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (map.get(String.valueOf(nums[i])) != null) {
        map.put(String.valueOf(nums[i]), map.get(String.valueOf(nums[i])) + 1);
        continue;
      }

      map.put(String.valueOf(nums[i]), 1);
    }

    if (n < map.size()) {
      return n;
    }

    return map.size();
  }
}

