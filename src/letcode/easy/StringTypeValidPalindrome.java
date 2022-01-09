package letcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class StringTypeValidPalindrome {
  public boolean isPalindrome(String s) {
    String replaceStr = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    int size = replaceStr.length()-1;
    for (int i = 0; i < replaceStr.length()/2; i++) {
      char tempA = replaceStr.charAt(i);
      char tempB = replaceStr.charAt(size);
      if(tempA != tempB){
        return false;
      }
      size--;
    }
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
