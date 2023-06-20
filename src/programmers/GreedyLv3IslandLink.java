package programmers;

import java.util.Arrays;
import java.util.Comparator;
import org.junit.Assert;
import org.junit.Test;

/***
 * 최소 비용으로 섬을 잇는
 */
public class GreedyLv3IslandLink {

  static int[] island;

  public static int findPoint(int a) {
    if (island[a] == a) {
      return a;
    } else {
      return findPoint(island[a]);
    }
  }

  public int solution(int n, int[][] costs) {
    Arrays.sort(costs, new Comparator<int[]>() {
      @Override
      public int compare(int[] arr1, int[] arr2) {
        return Integer.compare(arr1[2], arr2[2]);
      }
    });

    int ans = 0;
    island = new int[n];
    for (int i = 0; i < n; i++) {
      island[i] = i;
    }

    for (int[] i : costs) {
      int a = findPoint(i[0]);
      int b = findPoint(i[1]);
      if (a != b) {
        ans += i[2];
        island[a] = b;
      }
    }

    return ans;
  }

  @Test
  public void solution() {
    int[][] costs = {{0, 1, 1}, {0, 2, 2}, {1, 2, 5}, {1, 3, 1}, {2, 3, 8}};
    int n = 4;
    Assert.assertEquals(4, solution(n, costs));
  }
}
