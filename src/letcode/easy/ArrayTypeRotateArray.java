package letcode.easy;

import org.junit.Test;

public class ArrayTypeRotateArray {
  public void rotate(int[] nums, int k) {
    int n = nums.length;
    k %= n;
    reverse(nums, 0, n - k - 1);
    reverse(nums, n - k, nums.length - 1);
    reverse(nums, 0, nums.length - 1);
  }

  private void reverse(int[] n, int i, int j) {
    for (int p = i, q = j; p < q; p++, q--) {
      int temp = n[p];
      n[p] = n[q];
      n[q] = temp;
    }
  }

  @Test
  public void rotate_TEST_CASE1() {
    int[] nums = {1,2,3,4,5,6,7};
    rotate(nums, 3);
  }

  @Test
  public void rotate_TEST_CASE2() {
    int[] nums = {-1,-100,3,99};
    rotate(nums, 2);
  }
}
