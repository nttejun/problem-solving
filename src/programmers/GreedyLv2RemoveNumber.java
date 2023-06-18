package programmers;

import java.util.Stack;
import org.junit.Assert;
import org.junit.Test;

public class GreedyLv2RemoveNumber {

  public String solution(String number, int k) {
    char[] result = new char[number.length() - k];
    Stack<Character> stack = new Stack<>();

    for (int i = 0; i < number.length(); i++) {
      char c = number.charAt(i);
      while (!stack.isEmpty() && stack.peek() < c && k-- > 0) {
        stack.pop();
      }
      stack.push(c);
    }

    for (int i = 0; i < result.length; i++) {
      result[i] = stack.get(i);
    }

    return new String(result);
  }

  @Test
  public void solution() {
    String number = "1924";
    int k = 2;
    Assert.assertEquals("94", solution(number, k));
  }
}
