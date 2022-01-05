package letcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class StringTypeReverseInteger {
  public int reverse(int x) {
    int result = 0;
    while (x > 0) {
      result = x % 10 + result * 10 ;
      x = x / 10;
    }
    return result;
  }

  @Test
  public void reverse_테스트_CASE1() {
    int num = 123;
    Assert.assertEquals(321, reverse(num));
  }
}
