package letcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class ArrayTypeRemoveDuplicatesFromSortedArray {
  public int removeDuplicate(int[] nums) {
    int duplicateRemoveArrayLength = nums.length;
    for (int i = 0; i < nums.length-1; i++) {
      if (nums[i] == nums[i+1]) {
        duplicateRemoveArrayLength--;
      }
    }
    return duplicateRemoveArrayLength;
  }

  @Test
  public void removeDuplicate_테스트_Case1() {
    int[] nums = {1, 1, 2};
    Assert.assertEquals(removeDuplicate(nums), 2);
  }
}
