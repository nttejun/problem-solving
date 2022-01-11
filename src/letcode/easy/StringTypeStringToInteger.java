package letcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class StringTypeStringToInteger {
  public int myAtoi(String s) {
    long answer = 0;
    boolean isPositive = true, fixed = false;
    for (int index = 0; index < s.length(); index++) {
      char chr = s.charAt(index);
      if(chr == ' ') {
        if(fixed)
          break;
        continue;
      }
      if (chr == '+'){
        if(fixed)
          break;
        isPositive = false;
        fixed = true;
      }
      else if('0' <= chr && chr <= '9') {
        fixed = true;
        answer = (answer * 10) + (chr - '0');
        if(answer > Integer.MAX_VALUE) {
          return (isPositive) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
      }
      else {
        break;
      }
    }
    if(!isPositive)
      answer *= -1L;
    return (int)answer;
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
