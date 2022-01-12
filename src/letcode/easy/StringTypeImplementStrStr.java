package letcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class StringTypeImplementStrStr {
  public int strStr(String haystack, String needle) {
    if(needle.equals("")) {
      return 0;
    }

    int len = needle.length();
    for (int index = 0; index <= haystack.length() - len; index++) {
      boolean isEqual = true;

      for (int nIndex = 0; nIndex < len; nIndex++) {
        if (haystack.charAt(index + nIndex) != needle.charAt(nIndex)) {
          isEqual = false;
        }
      }

      if(isEqual) {
        return index;
      }
    }
    return -1;
  }

  @Test
  public void strStr_테스트_CASE1(){
    String haystack = "hello", needle = "ll";
    Assert.assertEquals(2, strStr(haystack, needle));
  }

  @Test
  public void strStr_테스트_CASE2(){
    String haystack = "aaaaa", needle = "bba";
    Assert.assertEquals(-1, strStr(haystack, needle));
  }

  @Test
  public void strStr_테스트_CASE3(){
    String haystack = "", needle = "";
    Assert.assertEquals(0, strStr(haystack, needle));
  }

  @Test
  public void strStr_테스트_CASE5(){
    String haystack = "a", needle = "a";
    Assert.assertEquals(0, strStr(haystack, needle));
  }
}
