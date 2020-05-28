package corp;

import org.junit.Test;

public class OneStore01 {

  int solution(int[] A, int X) {
    int N = A.length;
    if (N == 0) {
      return -1;
    }
    int l = 0;
    int r = N - 1;
    while (l < r) {
      int m = (l + r) / 2;
      if (A[m] > X) {
        r = m - 1;
      } else if (A[m] < X)  {
        l = m + 1;
      } else {
        l = m;
        break;
      }
    }
    if (A[l] == X) {
      return l;
    }
    return -1;
  }

  @Test
  public void TEST_01() {
    int[] a = new int[]{1, 2, 5, 9, 9};
    solution(a, 5);
  }

  @Test
  public void TEST_02() {
    int[] a = new int[]{1, 2, 5, 9, 9};
    solution(a, 1);
  }
}
