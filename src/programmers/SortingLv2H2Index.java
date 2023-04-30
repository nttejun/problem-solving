package programmers;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class SortingLv2H2Index {

  public int solution(int[] citations) {
    int answer = 0;
    Arrays.sort(citations);
    for (int i=0; i<citations.length; i++) {
      int smaller = Math.min(citations[i], citations.length-i);

      // 오름차순 이므로 for문이 끝날 때까지 최댓값 있을 경우 갱신이 필요
      if(smaller >= answer) {
        answer = Math.max(answer, smaller);
      }
    }
    return answer;
  }

  @Test
  public void TEST() {
    int[] nums = new int[]{3, 0, 6, 1, 5};
    Assert.assertEquals(3, solution(nums));
  }
}
