package corp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class OneStore02 {

  @Test
  public void TEST_01() {
    int[] a = new int[]{5, 3, 6, 1, 3};
    Assert.assertEquals(2, solution(a, 2));
  }
  @Test
  public void TEST_02() {
    int[] a = new int[]{8, 8, 4, 3};
    Assert.assertEquals(0, solution(a, 2));
  }
  @Test
  public void TEST_03() {
    int[] a = new int[]{3, 5, 1, 3, 9, 8};
    Assert.assertEquals(1, solution(a, 4));
  }

  private static int solution(int[] a, int k) {

    int min = Integer.MAX_VALUE;
    for (int i = 0; i <= a.length - k; i++) {

      List<Integer> list = new ArrayList<>();
      int result = -1;
      for (int j = 0; j < i; j++) {
        list.add(a[j]);
      }
      for (int j = a.length - 1; j >= i + k; j--) {
        list.add(a[j]);
      }

      Collections.sort(list);
      result = list.get(list.size() - 1) - list.get(0);

      if (min > result) {
        min = result;
      }
    }
    return min;
  }
}
