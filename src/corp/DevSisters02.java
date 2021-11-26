package corp;

import java.util.Arrays;
import java.util.Deque;
import java.util.Queue;
import org.junit.Assert;
import org.junit.Test;
import java.util.*;

public class DevSisters02 {


  public int[] solution(int[] snowballs) {
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < snowballs.length; i++) {
      if (i == 0 || snowballs[i] > 0 || (stack.isEmpty() && snowballs[i] < 0)) {
        stack.push(snowballs[i]);
        continue;
      }
      int next = Math.abs(snowballs[i]);
      if (stack.peek() == next) {
        stack.pop();
        continue;
      }
      if (stack.peek() > next) {
        continue;
      }
      while (!stack.empty()) {
        if (stack.peek() < next) {
          stack.pop();
          if (stack.isEmpty()) {
            stack.push(-next);
            break;
          }
          continue;
        }
        break;
      }
    }
    int[] answer = {};
    if (stack.size() != 0) {
      answer = new int[stack.size()];
      for (int i = 0; i < stack.size(); i++) {
        answer[i] = stack.get(i);
      }
    }
    return answer;
  }

  @Test
  public void TEST_01() {
    Assert.assertEquals("[4, 5]", Arrays.toString(solution(new int[]{4, 5, -4})));
  }

  @Test
  public void TEST_02() {
    Assert.assertEquals("[]", Arrays.toString(solution(new int[]{5, -5})));
  }

  @Test
  public void TEST_03() {
    Assert.assertEquals("[5]", Arrays.toString(solution(new int[]{5, -1, -2, -3, -4})));
  }

  @Test
  public void TEST_04() {
    Assert.assertEquals("[-2]", Arrays.toString(solution(new int[]{1, 5, -5, 5, -5, 5, -5, -2})));
  }

  @Test
  public void TEST_05() {
    Assert.assertEquals("[1, 6]", Arrays.toString(solution(new int[]{1, 6, 4, 2, -2, -5})));
  }
}
