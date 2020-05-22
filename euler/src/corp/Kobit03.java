package corp;

import org.junit.Assert;
import org.junit.Test;

public class Kobit03 {

  public int solution(String s) {
    int i, len = s.length();
    for (i = 0; i < len; i++) {
      if (isPalindrome(s.substring(i))) {
        return i + len;
      }
    }
    return len << 1;
  }

  public boolean isPalindrome(String s) {
    int i, len = s.length();
    int half = len / 2 ;
    for (i = 0; i <= half; i++) {
      if (s.charAt(i) != s.charAt(len - i - 1)) {
        return false;
      }
    }
    return true;
  }

  @Test
  public void TEST_01() {
    String s = "abab";
    Assert.assertEquals(5, solution(s));
  }

  @Test
  public void TEST_02() {
    String s = "abacaba";
    Assert.assertEquals(7, solution(s));
  }

  @Test
  public void TEST_03() {
    String s = "qwerty";
    Assert.assertEquals(11, solution(s));
  }
}
