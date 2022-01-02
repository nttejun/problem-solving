package letcode.easy;

import java.util.HashSet;
import java.util.Set;
import org.junit.Assert;
import org.junit.Test;

public class ArrayTypeContainsDuplicate {
  public boolean containsDuplicate(int[] nums) {
    Set<Integer> set = new HashSet<>();
    for (int i : nums) {
      if (set.contains(i)) {
        return true;
      } else {
        set.add(i);
      }
    }
    return false;
  }

  @Test
  public void duplicate_테스트_CASE1() {
    int[] nums = {1,2,3,1};
    Assert.assertTrue(containsDuplicate(nums));
  }

  @Test
  public void duplicate_테스트_CASE2() {
    int[] nums = {1,2,3,4};
    Assert.assertFalse(containsDuplicate(nums));
  }

  @Test
  public void duplicate_테스트_CASE3() {
    int[] nums = {1,1,1,3,3,4,3,2,4,2};
    Assert.assertTrue(containsDuplicate(nums));
  }
}
