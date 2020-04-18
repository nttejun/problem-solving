package letcode.easy;

import org.junit.Test;

public class TwoSum {

  public int[] twoSum(int[] nums, int target) {

    if(nums.length < 1){
      return null;
    }

    int[] res = new int[2];

    for(int i = 0; i < nums.length; i++){
      for(int j = i+1; j < nums.length; j++){
        if(target == nums[i] + nums[j]){
          res[0] = i;
          res[1] = j;
          return res;
        }
      }
    }
    return null;
  }

  @Test
  public void twoSumTest(){
    TwoSum twoSum = new TwoSum();
    int[] nums = new int[]{2, 7, 11, 15};
    int[] res = twoSum.twoSum(nums, 9);
    for (int num : res){
      System.out.println(num);
    }
  }
}
