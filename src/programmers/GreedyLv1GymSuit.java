package programmers;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class GreedyLv1GymSuit {

  /***
   * 전체 학생 수 : N
   * 도난당한 학생값들의 번호 배열 : lost
   * 여벌의 체육복 : reverse
   * 체육수업 들을 수 있는 학생 최댓값 : return
   *
   * 앞뒤에게만 빌려줄 수 있다
   * 4 -> 3,5
   */
  public int solution(int n, int[] lost, int[] reverse) {
    int answer = n - lost.length;

    Arrays.sort(lost);
    Arrays.sort(reverse);

    // reverse 사람도 lost 했다면 -1 값으로 변경하고 대여 가능 대상자에서 제외
    for (int i = 0; i < lost.length; i++) {
      for(int j = 0; j < reverse.length; j++) {
        if(lost[i] == reverse[j]) {
          answer++;
          lost[i] = -1;
          reverse[j] = -1;
          break;
        }
      }
    }

    for (int i = 0; i < lost.length; i++) {
      for (int j = 0; j < reverse.length; j++) {
        if ((lost[i] - 1 == reverse[j]) || (lost[i] + 1 == reverse[j])) {
          answer++;
          reverse[j] = -1;
          break;
        }
      }
    }
    return answer;
  }

  @Test
  public void solution() {
    int[] lost = new int[]{2 ,4};
    int[] reverse = new int[]{1, 3, 5};
    int n = 5;
    Assert.assertEquals(5, solution(5, lost, reverse));
  }
}
