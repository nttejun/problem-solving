package letcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumber {

  public boolean isPalindromeNumber(int x) {
    if (x < 0) return false;
    int reverse = 0;
    int temp = x;
    while (temp != 0) {
      reverse = reverse * 10 + temp % 10;
      temp /= 10;
    }
    return reverse == x;
  }

  @Test
  public void palindromeNumber_TRUE_테스트_CASE1() {
    int x = 121;
    Assert.assertTrue(isPalindromeNumber(x));
  }
  @Test
  public void palindromeNumber_FALSE_테스트_CASE1() {
    int x = -121;
    Assert.assertFalse(isPalindromeNumber(x));
  }
  @Test
  public void palindromeNumber_FALSE_테스트_CASE2() {
    int x = 10;
    Assert.assertFalse(isPalindromeNumber(x));
  }
}
