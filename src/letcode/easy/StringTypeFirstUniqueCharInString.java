package letcode.easy;

import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;

public class StringTypeFirstUniqueCharInString {
  public int firstUniqChar(String s) {
    Map<Character, Integer> countBucket = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      if (countBucket.get(s.charAt(i)) == null) {
        countBucket.put(s.charAt(i), 1);
      } else {
        countBucket.put(s.charAt(i), countBucket.get(s.charAt(i)) + 1);
      }
    }
    for (int i = 0; i < s.length(); i++) {
      if (countBucket.get(s.charAt(i)) == 1) {
        return i;
      }
    }
    return -1;
  }

  @Test
  public void uniqChar_테스트_CASE1() {
    String s = "loveleetcode";
    Assert.assertEquals(2, firstUniqChar(s));
  }

  @Test
  public void uniqChar_테스트_CASE2() {
    String s = "aabb";
    Assert.assertEquals(-1, firstUniqChar(s));
  }

  @Test
  public void uniqChar_테스트_CASE3() {
    String s = "leetcode";
    Assert.assertEquals(0, firstUniqChar(s));
  }
}
