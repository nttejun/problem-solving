package programmers;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class SearchLv2Dictionary {

  public int solution(String word) {
    String str = "AEIOU";
    // 5번째 자리, 4번째 자리, 3번째 자리 .. 마다 증가되는 문자열 숫자
    int[] x = {781, 156, 31, 6, 1};
    int index,result = word.length();

    // 다음 문자인 character index 값을 x[i] 값과 곱한다
    for(int i=0; i<word.length(); i++) {
      index = str.indexOf(word.charAt(i));
      result+=x[i]*index;
    }

    return result;
  }

  public int solutionDfs(String word) {
    List<String> list = new ArrayList<>();
    dfs(list, "", 0);
    return list.indexOf(word);
  }

  public void dfs(List<String> list, String str, int len) {
    if(len > 5) return;
    list.add(str);
    for(int i = 0; i < 5; i++) {
      dfs(list, str + "AEIOU".charAt(i), len + 1);
    }
  }

  @Test
  public void solution() {
    Assert.assertEquals(6, solution("AAAAE"));
    Assert.assertEquals(10, solution("AAAE"));
    Assert.assertEquals(1563, solution("I"));
    Assert.assertEquals(1189, solution("EIO"));
  }
}
