package letcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class ArrayTypeMoveZeroes {
  public int[] moveZeroes(int[] nums) {
    int index = 0;

    for (int i =0; i <nums.length; i++) {
      if (nums[i] != 0) {
        nums[index] = nums[i];
        index++;
      }
    }
    for (int i = index; i < nums.length; i++) {
      nums[i] = 0;
    }
    return nums;
  }

  @Test
  public void moveZeroes_테스트_CASE1() {
    int[] nums = {0, 1, 0, 3, 12};
    int[] expected = {1, 3, 12, 0, 0};
    int[] result = moveZeroes(nums);
    for (int i = 0; i < expected.length; i++) {
      Assert.assertEquals(expected[i], result[i]);
    }
  }

  @Test
  public void moveZeroes_테스트_CASE2() {
    int[] nums = {0};
    int[] expected = {0};
    int[] result = moveZeroes(nums);
    for (int i = 0; i < expected.length; i++) {
      Assert.assertEquals(expected[i], result[i]);
    }
  }
}
