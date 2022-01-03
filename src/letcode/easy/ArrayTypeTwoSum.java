package letcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class ArrayTypeTwoSum {
  public int[] twoSum(int[] nums, int target) {
    int[] result = new int[2];
    for (int i = 0; i < nums.length-1; i++) {
      for (int j = i+1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          result[0] = i;
          result[1] = j;
          return result;
        }
      }
    }
    return null;
  }

  @Test
  public void twoSum_테스트_CASE1() {
    int[] nums = {2, 7, 11, 15};
    int target = 9;
    int[] expected = {0, 1};
    int[] result = twoSum(nums, target);
    for (int i = 0; i < expected.length; i++) {
      Assert.assertEquals(expected[i], result[i]);
    }
    twoSum(nums, target);
  }

  @Test
  public void twoSum_테스트_CASE2() {
    int[] nums = {3, 2, 4};
    int target = 6;
    int[] expected = {1, 2};
    int[] result = twoSum(nums, target);
    for (int i = 0; i < expected.length; i++) {
      Assert.assertEquals(expected[i], result[i]);
    }
  }

  @Test
  public void twoSum_테스트_CASE3() {
    int[] nums = {3, 3};
    int target = 6;
    int[] expected = {0, 1};
    int[] result = twoSum(nums, target);
    for (int i = 0; i < expected.length; i++) {
      Assert.assertEquals(expected[i], result[i]);
    }
  }

  @Test
  public void twoSum_테스트_CASE4() {
    int[] nums = {2, 5, 5, 11};
    int target = 10;
    int[] expected = {1, 2};
    int[] result = twoSum(nums, target);
    for (int i = 0; i < expected.length; i++) {
      Assert.assertEquals(expected[i], result[i]);
    }
  }
}
