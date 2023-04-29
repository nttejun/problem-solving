package programmers;

import org.junit.Assert;
import org.junit.Test;

public class SortingLv2H2Index {
  public int solution(int[] citations) {
    int answer = 0;
    int length = citations.length;
    int sum = 0;
    for (int i : citations) {
      sum += i;
    }
    answer = sum / length;
    return answer;
  }

  @Test
  public void TEST() {
    int[] nums = new int[]{3, 0, 6, 1, 5};
    Assert.assertEquals(3, solution(nums));
  }
}
