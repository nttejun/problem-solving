package letcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class StringTypeReverseString {
  public char[] reverseString(char[] s) {
    for (int i = 0; i < s.length / 2; i++) {
      char temp = s[i];
      s[i] = s[s.length - 1 - i];
      s[s.length - 1 - i] = temp;
    }
    return s;
  }

  @Test
  public void reverse_테스트_CASE1(){
    char[] s = {'h','e','l','l','o'};
    char[] expected = {'o','l','l','e','h'};
    char[] result = reverseString(s);
    for (int i = 0; i < result.length; i++) {
      Assert.assertEquals(expected[i], result[i]);
    }
  }
}
