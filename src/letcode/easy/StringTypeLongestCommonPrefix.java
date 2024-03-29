package letcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class StringTypeLongestCommonPrefix {

  public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) {
      return null;
    }

    String tempStr = strs[0];
    if (strs.length == 1) {
      return tempStr;
    }

    for (int i = 1; i < strs.length; i++) {
      if (tempStr.length() == 0) {
        return tempStr;
      }

      String changeStr = "";
      for(int j = 0; j < strs[i].length(); j++) {
        if (tempStr.length() == j) {
          break;
        }
        if (tempStr.charAt(j) != strs[i].charAt(j)) {
          break;
        }
        changeStr += strs[i].charAt(j);
      }
      tempStr = changeStr;
    }

    return tempStr;
  }

  @Test
  public void TEST_1() {
    String[] str = new String[]{"flower","flow","flight"};
    String result = "fl";
    Assert.assertEquals(result, longestCommonPrefix(str));
  }

  @Test
  public void TEST_2() {
    String[] str = new String[]{"dog", "racecar", "car"};
    String result = "";
    Assert.assertEquals(result, longestCommonPrefix(str));
  }

  @Test
  public void TEST_3() {
    String[] str = new String[]{"aaa", "aa", "aaa"};
    String result = "aa";
    Assert.assertEquals(result, longestCommonPrefix(str));
  }
}
