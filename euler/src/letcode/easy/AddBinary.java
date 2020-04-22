package letcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class AddBinary {
  class Solution {
    public String addBinary(String a, String b) {

      int intA = Integer.parseInt(a, 2);
      int intB = Integer.parseInt(b, 2);
      int sum = intA + intB;

      String result = Integer.toBinaryString(sum);
      return String.valueOf(result);
    }
  }

  @Test
  public void test_AddBinary(){
    Solution solution = new Solution();
    Assert.assertEquals("100", solution.addBinary("11", "1"));
  }
}
