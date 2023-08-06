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
      // next 숫자 c 보다 작은 값이 stack 에 존재한다면 k가 0이 되기 전까지 작은 숫자는 스택에서 제거
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
