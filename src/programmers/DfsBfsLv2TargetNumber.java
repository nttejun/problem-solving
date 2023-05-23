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

    int answer = 0;
    dfs(0, numbers.length);
    return answer;
  }

  public int dfs(int value, int len) {
    int temp1 = 0;
    int temp2 = 0;

    for (int i = len; i < nums.length; i++) {
      temp1 = dfs(nums[i] + value, i);
      temp2 = dfs(nums[i] - value, i);
    }

    if(temp1 == goal) {
      count++;
    }

    if(temp2 == goal) {
      count++;
    }
  }

  @Test
  public void solution() {
    int[] nums = new int[]{1, 1, 1, 1, 1};
    Assert.assertEquals(5, solution(nums, 3));
  }
}
