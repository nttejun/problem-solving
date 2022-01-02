package letcode.easy;

import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;

public class ArrayTypeSingleNumber {
  public int singleNumber(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();
    for(int i : nums) {
      if (map.get(i) != null) {
        map.put(i, map.get(i)+1);
      } else {
        map.put(i, 1);
      }
    }

    for (int i : nums) {
      if (map.get(i) == 1) {
        return i;
      }
    }
    return -1;
  }

  @Test
  public void singleNumber_TEST_CASE1() {
    int[] nums = {2, 2, 1};
    Assert.assertEquals(1, singleNumber(nums));
  }

  @Test
  public void singleNumber_TEST_CASE2() {
    int[] nums = {4, 1, 2, 1, 2};
    Assert.assertEquals(4, singleNumber(nums));
  }

  @Test
  public void singleNumber_TEST_CASE3() {
    int[] nums = {1};
    Assert.assertEquals(1, singleNumber(nums));
  }
}
