package programmers;

import org.junit.Assert;
import org.junit.Test;

public class SearchLv2Dictionary {

  public int solution(String word) {
    String str = "AEIOU";
    int[] x = {781, 156, 31, 6, 1};
    int index,result = word.length();

    for(int i=0; i<word.length(); i++) {
      index = str.indexOf(word.charAt(i));
      result+=x[i]*index;
    }

    return result;
  }

  @Test
  public void solution() {
    Assert.assertEquals(6, solution("AAAAE"));
    Assert.assertEquals(10, solution("AAAE"));
    Assert.assertEquals(1563, solution("I"));
    Assert.assertEquals(1189, solution("EIO"));
  }
}
