package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class SkillTstLv1PriorityArrayRelocation {

  public List solution(String[] strings, int n) {
    List answer = new ArrayList();
    String[] nStartString = new String[strings.length];

    for (int i = 0; i < strings.length; i++) {
      String temp = strings[i];
      String f = temp.substring(0, n);
      String b = temp.substring(n, temp.length());
      nStartString[i] = b + f;
    }

    Arrays.sort(nStartString);

    for (int i = 0; i < strings.length; i++) {
      String temp = nStartString[i];
      String f = temp.substring(0, temp.length() - n);
      String b = temp.substring(temp.length() - n, temp.length());
      answer.add(b + f);
    }
    return answer;
  }

  @Test
  public void test() {
    Assert
        .assertEquals("[car, bed, sun]", solution(new String[]{"sun", "bed", "car"}, 1).toString());
    Assert.assertEquals("[abcd, abce, cdx]",
        solution(new String[]{"abce", "abcd", "cdx"}, 1).toString());
  }
}
