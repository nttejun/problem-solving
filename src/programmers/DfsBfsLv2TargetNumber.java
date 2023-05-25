package programmers;

import org.junit.Assert;
import org.junit.Test;

public class DfsBfsLv2TargetNumber {

  private static int[] nums;
  private static int goal;
  private static int count;

  public int solution(int[] numbers, int target) {
    nums = numbers;
    goal = target;
    dfs(0, 0);
    return count;
  }

  public void dfs(int value, int len) {
    if(len == nums.length) {
      if(value == goal) count++;
      return;
    }

    dfs(value + nums[len], len+1);
    dfs(value - nums[len], len+1);
  }

  @Test
  public void solution() {
    int[] nums = new int[]{1, 1, 1, 1, 1};
    Assert.assertEquals(5, solution(nums, 3));
  }
}
