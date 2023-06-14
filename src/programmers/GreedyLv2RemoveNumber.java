package programmers;

import org.junit.Assert;
import org.junit.Test;

public class GreedyLv2RemoveNumber {

  public String solution(String number, int k) {
    StringBuilder builder = new StringBuilder(number);
    int length = builder.length() - k;

    for (int i = 1; i < builder.length() && builder.length() > length; i++) {
      if (builder.charAt(i) > builder.charAt(i - 1)) {
        builder.deleteCharAt(i - 1);
        i = Math.max(0, i - 2);
      }
    }

    return builder.substring(0, length);
  }

  @Test
  public void solution() {
    String number = "1924";
    int k = 2;
    Assert.assertEquals("94", solution(number, k));
  }
}
