package programmers;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

/***
 * [[-20,-15], [-14,-5], [-18,-13], [-5,-3]]
 */
public class GreedyLv3EnforcementCamera {

  public int solution(int[][] routes) {
    int answer = 0;
    Arrays.sort(routes, (a, b) -> Integer.compare(a[1], b[1]));

    int cam = Integer.MIN_VALUE;

    for (int[] route : routes) {
      if (cam < route[0]) {
        cam = route[1];
        answer++;
      }
    }

    return answer;
  }


  @Test
  public void solution() {
    int[][] routes = new int[][]{{-20,-15}, {-14,-5}, {-18,-13}, {-5,-3}};
    Assert.assertEquals(2, solution(routes));
  }
}
