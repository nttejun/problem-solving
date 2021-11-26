/*
package resolve;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

*/


import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Created by nttej on 2017-11-12.
 *//*


 */
/*

1 day > person1 =  4 , person2 = 5
status > gap = 1

[입력 값]
입력 값 범위
1 <= A, K <= 100
0 <= P <= 100

[샘플 1]
3 5 1 = ?

[샘플 2]
4 5 1 = 2

*/


public class Ebay4 {

  static int minNum(int a, int k, int p) {

    int divide = p;

    int minus = k - a;

    // 따라잡지 못하는 경우
    if (a > k) {

      return -1;

    }

    int day = p / minus;

    // gap over
    if (p % minus == 0) {

      day++;

    }

    return day;

  }

  @Test
  public void possible() {
    assertEquals(2, minNum(4, 5, 1));
  }

  @Test
  public void impossible() {
    assertEquals(-1, minNum(5, 3, 1));
  }
}
