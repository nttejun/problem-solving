package letcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class ArrayTypeBestTimeBuyAndSellStock {
  public int maxProfit(int[] prices) {
    int profit = 0;
    for (int i = 0; i < prices.length-1; i++) {
      if (prices[i] < prices[i+1]) {
        if (prices[i+1] < prices [i+2])
        profit += prices[i+1] - prices[i];
        i++;
      }
    }
    return profit;
  }

  @Test
  public void getMaxProfit_TEST_CASE1() {
    int[] prices = {7,1,5,3,6,4};
    Assert.assertEquals(7, maxProfit(prices));
  }

  @Test
  public void getMaxProfit_TEST_CASE2() {
    int[] prices = {1,2,3,4,5};
    Assert.assertEquals(4, maxProfit(prices));
  }

  @Test
  public void getMaxProfit_TEST_CASE3() {
    int[] prices = {7,6,4,3,1};
    Assert.assertEquals(0, maxProfit(prices));
  }
}
