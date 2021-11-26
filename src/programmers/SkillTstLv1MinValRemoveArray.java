package programmers;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class SkillTstLv1MinValRemoveArray {

  public int[] solution(int[] arr) {
    if (arr.length < 2) {
      int[] answer = new int[1];
      answer[0] = -1;
      return answer;
    }

    int min = arr[0];
    for (int i : arr) {
      if (i < min) {
        min = i;
      }
    }

    int idx = -1;
    int[] answer = new int[arr.length - 1];
    for (int i : arr) {
      if (min != i) {
        answer[++idx] = i;
      }
    }

    if (answer.length == 0) {
      answer[0] = -1;
    }
    return answer;
  }

  public String print(int[] arr) {
    List<Integer> list = new ArrayList<>();
    for (int i : arr) {
      list.add(i);
    }
    return list.toString();
  }

  @Test
  public void 첫번째_테스트_케이스() {
    int[] case1 = solution(new int[]{4, 3, 2, 1});
    int[] case2 = solution(new int[]{10});
    Assert.assertEquals("[4, 3, 2]", print(case1));
    Assert.assertEquals("[-1]", print(case2));
  }
}
