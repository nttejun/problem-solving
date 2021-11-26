package corp;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import org.junit.Test;

/**
 * Created by nttej on 2017-11-12.
 */

/*
    n개

    n개 수들 배수 중 공통 되는 가장 작은 숫자

    가장 작은 n 구하기

    최소 n*n 값 구하기

    n*n 값 검증

    가장 작은 n을 1부터 n개로 나누어 0이 되는 숫자가 답

    실패 시 n*n*n....
 */

public class NLeastCommonNumber {

  public long nlcm(int[] num) {

    int[] value = new int[num.length];

    for (int i = 0; i < num.length; i++) {
      value[i] = num[i];
    }

    Arrays.sort(value);

    int res = value[0];

    // 1보다 작을 시 최소 값
    if (res <= 1) {
      return 0;
    }

    // 체크 곱하기
    int temp = value[value.length - 1];

    while (check(res, value) != res) {
      res = res + value[0];
    }
    return res;
  }

  public int check(int res, int[] value) {
    for (int i = 0; i < value.length; i++) {
      if (res % value[i] != 0) {
        return 0;
      }
    }
    return res;
  }

  @Test
  public void check1() {
    int[] res = {2, 6, 8, 14};
    assertEquals(168, nlcm(res));
  }

  @Test
  public void check2() {
    int[] res = {86, 54, 91, 10, 3, 63, 84, 57, 66, 22};
    assertEquals(441621180, nlcm(res));
  }
}
