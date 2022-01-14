package letcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class StringTypeCountAndSay {

  public String countAndSay(int n) {
    if (n == 1) return "1";

    StringBuilder sb = new StringBuilder();
    String s = countAndSay(n - 1);
    char value = s.charAt(0);
    int cnt = 0;

    for (int i = 0; i < s.length(); i++) {
      char target = s.charAt(i);

      if (target == value) {
        cnt++;
        continue;
      }

      sb.append(cnt).append(value);
      value = target;
      cnt = 1;
    }

    sb.append(cnt).append(value);

    return sb.toString();
  }

  @Test
  public void countAndSay_테스트_CASE1() {
    int num = 4;
    Assert.assertEquals("1211", countAndSay(num));
  }

  @Test
  public void countAndSay_테스트_CASE2() {
    int num = 5;
    Assert.assertEquals("111221", countAndSay(num));
  }

  @Test
  public void countAndSay_테스트_CASE3() {
    int num = 6;
    Assert.assertEquals("312211", countAndSay(num));
  }

  @Test
  public void countAndSay_테스트_CASE4() {
    int num = 8;
    Assert.assertEquals("1113213211", countAndSay(num));
  }

  @Test
  public void countAndSay_테스트_CASE5() {
    int num = 9;
    Assert.assertEquals("31131211131221", countAndSay(num));
  }
}
