package corp;

import org.junit.Assert;
import org.junit.Test;

public class Ebay05_2020 {

  public int getDeleteCount(String s, String t) {

    int result = 0;
    while (s.indexOf(t) != -1) {
      result++;
      s = s.replaceFirst(t, "");
    }

    return result;
  }

  @Test
  public void TEST_01() {
    String s = "aabcbcd";
    String t = "abc";
    Assert.assertEquals(2, getDeleteCount(s, t));
  }

  @Test
  public void TEST_02() {
    String s = "aaaaabbbbbb";
    String t = "ab";
    Assert.assertEquals(5, getDeleteCount(s, t));
  }
}
