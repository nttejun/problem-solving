package programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class GreedyLv2RemoveNumber {
  public String solution(String number, int k) {
    String answer = "";
    List<String> list = new ArrayList<>();

    for(int i = 0; i < number.length(); i++) {
      list.add(String.valueOf(number.charAt(i)));
    }

    list.sort(Comparator.reverseOrder());

    for (int i = 0; i < k; i++) {
      answer += list.get(i);
    }

    return answer;
  }

  @Test
  public void solution() {
    String number = "1924";
    int k = 2;
    Assert.assertEquals("94", solution(number, k));
  }
}
