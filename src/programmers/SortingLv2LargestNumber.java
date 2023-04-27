package programmers;

import java.util.Arrays;
import java.util.Comparator;
import org.junit.Assert;
import org.junit.Test;

public class SortingLv2LargestNumber {

  public String solution(int[] numbers) {

    Integer[] arr = new Integer[numbers.length];
    for (int i = 0; i < numbers.length; i++) {
      arr[i] = numbers[i];
    }

    Arrays.sort(arr, new Comparator<Integer>() {
      @Override
      public int compare(Integer a, Integer b) {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);
        char charA = strA.charAt(0);
        char charB = strB.charAt(0);
        return Character.compare(charA, charB);
      }
    });

    String answer = "";
    for (int i = arr.length - 1; i >= 0; i--) {
      answer += arr[i];
    }

    return answer;
  }

  @Test
  public void TEST_성공케이스() {
    int[] numbers = new int[]{6, 10, 2};
    Assert.assertEquals("6210", solution(numbers));
  }
}
