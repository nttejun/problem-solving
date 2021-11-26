package letcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class SearchInsertPosition {

  public int searchInsert(int[] nums, int target) {
    int count = 0;
    for (int i : nums) {
      if (i == target) {
        return count;
      }
      if (target < i) {
        return count;
      }
      count++;
    }
    return count;
  }

  @Test
  public void searchInsertTest() {
    Assert.assertEquals(2, searchInsert(new int[]{1, 3, 5, 6}, 5));
    Assert.assertEquals(1, searchInsert(new int[]{1, 3, 5, 6}, 2));
    Assert.assertEquals(4, searchInsert(new int[]{1, 3, 5, 6}, 7));
    Assert.assertEquals(0, searchInsert(new int[]{1, 3, 5, 6}, 0));
  }
}

