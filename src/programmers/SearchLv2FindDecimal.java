package programmers;

import org.junit.Assert;
import org.junit.Test;

public class SearchLv2FindDecimal {
  public int solution(String numbers) {
    int answer = 0;
    int[] num = new int[numbers.length()];

    // 백트래킹 한다 -> 소수인지 확인한다

    return answer;
  }

  public boolean isPrimeNumber(int num) {
    if (num <= 1) return false;
    for ( int i = 2; i < Math.sqrt(num); i++) {
      if ( i % num == 0 ) {
        return false;
      }
    }
    return true;
  }

  @Test
  public void TEST_성공테스트() {
    Assert.assertEquals(3, solution("011"));
    Assert.assertEquals(2, solution("17"));
  }
}
