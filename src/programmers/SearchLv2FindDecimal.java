package programmers;

import java.util.HashSet;
import org.junit.Assert;
import org.junit.Test;

public class SearchLv2FindDecimal {

  HashSet<Integer> set = new HashSet<>();

  public int solution(String numbers) {
    int answer = 0;

    recursion("", numbers);

    for (int number : set) {
      if (isPrime(number)) {
        answer++;
      }
    }

    return answer;
  }

  private boolean isPrime(int number) {

    if (number == 0 || number == 1) {
      return false;
    }

    for(int i = 2; i <= Math.sqrt(number); i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }

  private void recursion(String word, String numbers) {
    if (!word.equals("")) {
      set.add(Integer.parseInt(word));
    }

    for (int i = 0; i < numbers.length(); i++) {
      recursion(word + numbers.charAt(i), numbers.substring(0, i) + numbers.substring(i + 1));
    }
  }

  @Test
  public void solution() {
    String num = "17";
    Assert.assertEquals(3, solution(num));
  }
}
