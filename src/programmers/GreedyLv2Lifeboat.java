package programmers;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

/***
 * 사람 + 사람.. <= limit
 * 가장 큰 수와 작은 수를 합해 최소 갯수로 count */
public class GreedyLv2Lifeboat {

  public int solution(int[] people, int limit) {
    int answer = 0;
    Arrays.sort(people);

    int maxIdx = people.length - 1;
    int minIdx = 0;

    while (maxIdx >= minIdx) {
      if (people[maxIdx] + people[minIdx] <= limit) {
        answer++;
        maxIdx--;
        minIdx++;
      } else {
        answer++;
        maxIdx--;
      }
    }

    return answer;
  }

  @Test
  public void solution() {
    int[] people = new int[]{70, 50, 80, 50};
    int limit = 100;
    Assert.assertEquals(3, solution(people, limit));
  }
}
