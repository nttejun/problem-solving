package programmers;

import java.util.Arrays;
import java.util.PriorityQueue;
import org.junit.Assert;
import org.junit.Test;

public class HeapLv3DiskController {
  public int solution(int[][] jobs) {
    int answer = 0;

    Arrays.sort(jobs, (a, b) -> a[0] - b[0]);

    PriorityQueue<int[]> queue = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

    int index = 0;
    int count = 0;
    int total = 0;
    int end = 0;
    while (count < jobs.length) {

      while (index < jobs.length && jobs[index][0] <= end) {
        queue.add(jobs[index++]);
      }

      if(queue.isEmpty()) {
        end = jobs[index][0];
      } else {
        int[] cur = queue.poll();
        total += cur[1] + end - cur[0];
        end += cur[1];
        count++;
      }
    }

    return total / jobs.length;
  }

  @Test
  public void solution() {
    int[][] jobs = new int[][]{{0,3}, {1,9}, {2,6}};
    Assert.assertEquals(9, solution(jobs));
  }
}
