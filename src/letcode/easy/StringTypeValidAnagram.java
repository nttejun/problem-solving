package letcode.easy;

import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;

public class StringTypeValidAnagram {

  public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    if (s.length() > 10000) {
      return false;
    }

    Map<Character, Integer> sMap = new HashMap<>();
    Map<Character, Integer> tMap = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      if (sMap.get(s.charAt(i)) == null) {
        sMap.put(s.charAt(i), 1);
      } else {
        sMap.put(s.charAt(i), sMap.get(s.charAt(i)) + 1);
      }
    }

    for (int j = 0; j < t.length(); j++) {
      if (tMap.get(t.charAt(j)) == null) {
        tMap.put(t.charAt(j), 1);
      } else {
        tMap.put(t.charAt(j), tMap.get(t.charAt(j)) + 1);
      }
    }

    for (int k = 0; k < s.length(); k++) {
      if (sMap.get(t.charAt(k)) != tMap.get(t.charAt(k))) {
        return false;
      }
    }
    return true;
  }

  @Test
  public void isAnagram_테스트_CASE1() {
    String s = "anagram", t = "nagaram";
    Assert.assertTrue(isAnagram(s, t));
  }

  @Test
  public void isAnagram_테스트_CASE2() {
    String s = "rat", t = "car";
    Assert.assertFalse(isAnagram(s, t));
  }
}
