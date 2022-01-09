package letcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class StringTypeStringToInteger {
  public int myAtoi(String s) {
    s = s.replaceAll("^\\s+", "");
    boolean isMinus = s.startsWith("-") ? true : false;
    String replaceString = s.replaceAll("[^0-9]", "");

    if (isMinus) {
      return Integer.parseInt(replaceString) * -1;
    }
    return Integer.parseInt(replaceString);
  }

  @Test
  public void myAtoi_테스트_CASE1() {
    String s = "42";
    Assert.assertEquals(42, myAtoi(s));
  }

  @Test
  public void myAtoi_테스트_CASE2() {
    String s = "-42";
    Assert.assertEquals(-42, myAtoi(s));
  }

  @Test
  public void myAtoi_테스트_CASE3() {
    String s = "4193 with words";
    Assert.assertEquals(4193, myAtoi(s));
  }

  @Test
  public void myAtoi_테스트_CASE4() {
    String s = "    -42";
    Assert.assertEquals(0, myAtoi(s));
  }
}
