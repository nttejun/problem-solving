package programmers;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class Lv2SkillTestMatrixMultiplication {

  public int solution(int[] A, int[] B) {
    int answer = 0;

    Arrays.sort(A);
    Arrays.sort(B);

    int b = A.length-1;
    for (int i = 0; i < A.length; i++) {
      System.out.println(A[i] + " == " + B[i]);
      answer += A[i] * B[b];
      b--;
    }

    return answer;
  }


  public int solution_v2(int[] A, int[] B) {
    int answer = 0;

    Arrays.sort(A);
    Arrays.sort(B);

    for (int i = 0; i < A.length; i++) {
      answer += A[i] * B[B.length - 1 - i];
    }

    return answer;
  }

  @Test
  public void t() {
    int[] A = new int[]{1, 4, 2};
    int[] B = new int[]{5, 4, 4};
    Assert.assertEquals(29, solution(A, B));

    int[] C = new int[]{1, 2};
    int[] D = new int[]{3, 4};
    Assert.assertEquals(10, solution(C, D));
  }
}
