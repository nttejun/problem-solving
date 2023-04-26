package programmers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class SortingLv2LargestNumber {
  public String solution(int[] numbers) {
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < numbers.length; i++) {
      int j= i;
      int limit = 0;
      String temp = "";
      while (limit < numbers.length) {
        if(j == numbers.length) {
          j = 0;
        }
        temp += numbers[j];
        j++;
        limit++;
      }
      list.add(Integer.parseInt(temp));
    }

    Collections.sort(list);

    return String.valueOf(list.get(0));
  }

  @Test
  public void TEST_성공케이스() {
    int[] numbers = new int[]{6, 10, 2};
    Assert.assertEquals("6210", solution(numbers));
  }
}
