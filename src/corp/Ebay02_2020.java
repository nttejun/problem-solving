package corp;

import java.util.HashMap;
import org.junit.Assert;
import org.junit.Test;

public class Ebay02_2020 {

  public boolean solution(String s, String t) {

    HashMap<String, String> map = new HashMap();
    for (int i = 0; i < s.length(); i++) {
      if (map.containsKey(String.valueOf(s.charAt(i)))) {
        String d1 = map.get(String.valueOf(s.charAt(i)));
        String d2 = String.valueOf(t.charAt(i));

        if (!d1.equals(d2)) {
          return false;
        }
      } else {
        map.put(String.valueOf(s.charAt(i)), String.valueOf(t.charAt(i)));
      }
    }
    return true;
  }

  @Test
  public void TEST_01() {
    String s = "hello";
    String t = "cbvvu";
    Assert.assertTrue(solution(s, t));
  }

  @Test
  public void TEST_02() {
    String s = "hello";
    String t = "bbvmu";
    Assert.assertFalse(solution(s, t));
  }

  @Test
  public void TEST_03() {
    String s = "world";
    String t = "abcde";
    Assert.assertTrue(solution(s, t));
  }
}
