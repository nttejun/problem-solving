package letcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class StringTypeValidPalindrome {
  public boolean isPalindrome(String s) {
    return true;
  }

  @Test
  public void isPalindrome_테스트_CASE1() {
    String s = "A man, a plan, a canal: Panama";
    Assert.assertTrue(isPalindrome(s));
  }

  @Test
  public void isPalindrome_테스트_CASE2() {
    String s = "race a car";
    Assert.assertTrue(isPalindrome(s));
  }

  @Test
  public void isPalindrome_테스트_CASE3() {
    String s = " ";
    Assert.assertTrue(isPalindrome(s));
  }
}
