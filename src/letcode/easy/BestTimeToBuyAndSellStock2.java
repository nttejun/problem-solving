package letcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class BestTimeToBuyAndSellStock2 {

  public int maxProfit(int[] prices) {

    int profit = 0;

    for (int i = 0; i < prices.length - 1; i++) {
      if (prices[i] < prices[i + 1]) {
        profit += prices[i + 1] - prices[i];
      }
    }
    return profit;
  }

  @Test
  public void maxProfit() {
    Assert.assertEquals(7, maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    Assert.assertEquals(4, maxProfit(new int[]{1, 2, 3, 4, 5}));
    Assert.assertEquals(0, maxProfit(new int[]{7, 6, 4, 3, 1}));
  }

}
