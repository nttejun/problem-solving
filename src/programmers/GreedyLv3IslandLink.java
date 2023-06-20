package programmers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;

/***
 * 최소 비용으로 섬을 잇는
 */
public class GreedyLv3IslandLink {
  public int solution(int n, int[][] costs) {
    int answer = 0;
    int max = 0;
    Arrays.sort(costs, new Comparator<int[]>() {
      @Override
      public int compare(int[] arr1, int[] arr2) {
        return Integer.compare(arr1[2], arr2[2]);
      }
    });

    for (int[] arr : costs) {
      max = Math.max(arr[1], max);
    }

    Map<Integer, Boolean> visited = new HashMap<>();
    for (int i = 0 ; i < max; i++) {
      visited.put(i, false);
    }

    for (int i = 0; i < costs.length; i++) {
      if(!visited.getOrDefault(costs[i][0], false) || !visited.getOrDefault(costs[i][1], false)) {
        visited.put(costs[i][0], true);
        visited.put(costs[i][1], true);
        answer += costs[i][2];
      }
    }

    return answer;
  }

  @Test
  public void solution() {
    int[][] costs = {{0, 1, 1}, {0, 2, 2}, {1, 2, 5}, {1, 3, 1}, {2, 3, 8}};
    int n = 4;
    Assert.assertEquals(4, solution(n, costs));
  }
}
