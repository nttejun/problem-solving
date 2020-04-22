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

    public String addBinaryBigInteger(String a, String b) {
      int i = a.length() - 1, j = b.length() - 1;
      int carry = 0;
      StringBuilder sb = new StringBuilder();

      while( i >= 0 || j >= 0) {
        int sum = carry;

        if (i >= 0) {
          sum += a.charAt(i--) - '0';
        }
        if (j >= 0) {
          sum += b.charAt(j--) - '0';
        }

        sb.append(sum % 2);

        carry = sum / 2;
      }

      if (carry > 0) {
        sb.append(1);
      }

      return sb.reverse().toString();
    }
  }

  @Test
  public void test_AddBinary(){
    Solution solution = new Solution();
    Assert.assertEquals("100", solution.addBinary("11", "1"));
    Assert.assertEquals("100", solution.addBinaryBigInteger("11", "1"));
    Assert.assertEquals("110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000", solution.addBinaryBigInteger("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
  }
}
