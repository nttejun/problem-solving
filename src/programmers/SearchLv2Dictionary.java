package programmers;

import org.junit.Assert;
import org.junit.Test;

public class SearchLv2Dictionary {

  public int solution(String word) {
    int answer = 0;
    return answer;
  }

  @Test
  public void solution() {
    Assert.assertEquals(6, solution("AAAAE"));
    Assert.assertEquals(10, solution("AAAE"));
    Assert.assertEquals(1563, solution("I"));
    Assert.assertEquals(1189, solution("EIO"));
  }
}
