package letcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class ArrayTypePlusOne {
  public int[] plusOne(int[] digits) {
    int n = digits.length;
    int[] result;

    for (int i = n -1; i >= 0; i--) {
      digits[i]++;
      if(digits[i] < 10) {
        return digits;
      }
      digits[i] = 0;
    }
    result = new int[n+1];
    result[0] = 1;

    return result;
  }

  @Test
  public void plusOne_테스트_CASE1() {
    int[] nums = {1, 2, 3};
    String expected = "124";
    String result = "";
    for (int i : plusOne(nums)) {
      result += i;
    }
    Assert.assertEquals(expected, result);
  }

  @Test
  public void plusOne_테스트_CASE2() {
    int[] nums = {4, 3, 2, 1};
    String expected = "4322";
    String result = "";
    for (int i : plusOne(nums)) {
      result += i;
    }
    Assert.assertEquals(expected, result);
  }

  @Test
  public void plusOne_테스트_CASE3() {
    int[] nums = {9};
    String expected = "10";
    String result = "";
    for (int i : plusOne(nums)) {
      result += i;
    }
    Assert.assertEquals(expected, result);
  }

  @Test
  public void plusOne_테스트_CASE4() {
    int[] nums = {9,9,9};
    String expected = "1000";
    String result = "";
    for (int i : plusOne(nums)) {
      result += i;
    }
    Assert.assertEquals(expected, result);
  }
}
