package letcode.medium;

import org.junit.Assert;
import org.junit.Test;

public class FindFirstAndLastPosition {
  public int[] searchRange(int[] nums, int target) {

    int[] result = new int[]{-1, -1};
    int count = 0;
    int index = 0;
    for(int i : nums){
      if(i == target){
        if(count == 0){
          result[0] = index;
          result[1] = index;
          count++;
        } else {
          result[1] = index;
        }
      }
      index++;
    }
    return result;
  }

  public String toStringPrint(int[] array){
    String res = "";
    for(int i : array){
      res += i + " ";
    }
    return res;
  }

  @Test
  public void searchInsertTest(){
    Assert.assertEquals("3 4 ", toStringPrint(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
    Assert.assertEquals("-1 -1 ", toStringPrint(searchRange(new int[]{5, 7, 7, 8, 8, 10}, 0)));
    Assert.assertEquals("0 0 ", toStringPrint(searchRange(new int[]{1}, 1)));
  }
}
