package letcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import org.junit.Test;

public class MaximumSubarray {

  public int maxSubArray(int[] nums) {

    int[] temp = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      temp[i] = nums[i];
    }

    Arrays.sort(temp);

    Stack<Integer> stack = new Stack();
    stack.push(temp[0]);
    for (int i : temp) {
      if (stack.peek() != i) {
        stack.push(i);
      }
    }

    int max = 0;
    for (int i = 0; i < 2; i++) {
      if (!stack.isEmpty()) {
        max += stack.peek();
        stack.pop();
      }
    }
    return max;
  }

  public int maxSubArray1(int[] nums) {
    int result = Integer.MIN_VALUE;
    int start = 0;
    int end = 0;
    int tempSum = 0;
    while (start < nums.length && end < nums.length) {
      tempSum += nums[end++];
      result = Math.max(result, tempSum);
      if (tempSum < 0) {
        tempSum = 0;
        start = end;
      }
    }
    return result;
  }

  public int maxSubArray2(int[] nums) {
    if (nums == null || nums.length == 0) {
      return 0;
    }

    /** The idea is to create a prefix sum array, but as we need only the previous element of the
     * prefix sum array, so instead of creating a full array we are only keeping a variable as prev
     * to keep space complexity as O(1) */
    int res = nums[0], prev = nums[0], min = Math.min(0, nums[0]);
    for (int i = 1; i < nums.length; i++) {
      int curr = prev + nums[i];
      res = Math.max(res, curr - min);
      min = Math.min(min, curr);
      prev = curr;
    }
    return res;
  }

  @Test
  public void maxSubArray() {
    int[] nums = {-2, 1};
    int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
    maxSubArray(nums);
    maxSubArray1(nums);
    maxSubArray2(nums1);
  }
}
