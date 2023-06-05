package programmers;

import java.util.PriorityQueue;
import org.junit.Assert;
import org.junit.Test;

public class HeapLv2MoreHot {
// k 이상으로 높인다
// 섞은 음식 지수 = 가장 낮은 지수 + ( 두번째 낮은 지수 * 2 )
// 모든 음식 지수 K 이상일 때 까지 반복한다
// 반복 최소횟수

  /***
   * 1. 우선순위 정렬한다
   * 2. 비교한다
   *  - 가장 낮은 지수가 k 이상일 때 까지 진행
   * 3. 낮다면 마지막 지수와 두번 째 마지막 지수를 섞는다
   */

  public int solution(int[] scoville, int k) {
    int answer = 0;

    PriorityQueue pQueue = new PriorityQueue();

    for (int i = 0; i < scoville.length; i++) {
      pQueue.offer(scoville[i]);
    }

    while ((int) pQueue.peek() <= k) {
      if(pQueue.size() == 1) {
        return -1;
      }

      int firstVal = (int) pQueue.poll();
      int secondVal = (int) pQueue.poll();

      if (firstVal >= k) {
        return answer;
      }

      answer++;
      pQueue.offer(firstVal + (secondVal * 2));
    }

    if (pQueue.size() == 0) {
      return -1;
    }

    return answer;
  }

  @Test
  public void SOLUTION_TEST_1() {
    int k = 7;
    int[] list = new int[]{1, 2, 3, 9, 10, 12};
    Assert.assertEquals(2, solution(list, k));
  }

  @Test
  public void SOLUTION_TEST_2() {
    int k = 50;
    int[] list = new int[]{1, 20, 15, 45, 5, 6};
    Assert.assertEquals(3, solution(list, k));
  }
}