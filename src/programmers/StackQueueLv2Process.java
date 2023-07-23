package programmers;

import java.util.Collections;
import java.util.PriorityQueue;
import org.junit.Test;

public class StackQueueLv2Process {
  public int solution(int[] priorities, int location) {
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); //우선순위 큐를 내림차순 정렬로 설정한다.
    int answer = 0;

    for (int i = 0; i < priorities.length; i++) {
      pq.add(priorities[i]);
    }

    while (!pq.isEmpty()) {
      for (int i = 0; i < priorities.length; i++) {
        // location 보다 높은 우선순위가 있다면 낮은 순위에서는 실행을 하지 않는다
        if (priorities[i] == pq.peek()) {
          if (i == location) {
            answer++;
            return answer;
          }
          pq.poll();
          answer++;
        }
      }
    }
    return -1;
  }

  @Test
  public void solution_1() {
    int[] priorities = new int[]{1, 1, 9, 1, 1, 1};
    int location = 0;
    StackQueueLv2Process process = new StackQueueLv2Process();
    process.solution(priorities, location);
  }

  @Test
  public void solution_2() {
    int[] priorities = new int[]{2, 1, 3, 2};
    int location = 2;
    StackQueueLv2Process process = new StackQueueLv2Process();
    process.solution(priorities, location);
  }
}
