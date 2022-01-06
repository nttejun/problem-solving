package letcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class StringTypeReverseInteger {
  public int reverse(int x) {
    boolean isMinus = (x < 0) ? true : false;
    long xNum = Math.abs(x);
    long result = 0;
    while (xNum > 0) {
      result = xNum % 10 + result * 10 ;
      xNum = xNum / 10;
    }

    result = (isMinus) ? -result : result;
    if (2147483647 < result || -2147483647 > result) {
      return 0;
    }

    return (int) result;
  }

  @Test
  public void reverse_테스트_CASE1() {
    int num = 123;
    Assert.assertEquals(321, reverse(num));
  }

  @Test
  public void reverse_테스트_CASE2() {
    int num = -123;
    Assert.assertEquals(-321, reverse(num));
  }

  @Test
  public void reverse_테스트_CASE3() {
    int num = 120;
    Assert.assertEquals(21, reverse(num));
  }

  @Test
  public void reverse_테스트_CASE4() {
    int num = 1534236469;
    Assert.assertEquals(0, reverse(num));
  }
}
