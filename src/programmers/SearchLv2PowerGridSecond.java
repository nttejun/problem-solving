package programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.junit.Assert;
import org.junit.Test;

public class SearchLv2PowerGridSecond {

  public List<Integer>[] list;

  public int solution(int n, int[][] wires) {
    int answer = 100;
    list = new List[n + 1];
    for (int i = 0; i <= n; i++) {
      list[i] = new ArrayList<>();
    }

    for (int i = 0; i < n-1; i++) {
      list[wires[i][0]].add(wires[i][1]);
      list[wires[i][1]].add(wires[i][0]);
    }

    for (int i = 0; i < n-1; i++) {
      int a = bfs(wires[i][0], wires[i][1], n);
      int b = bfs(wires[i][1], wires[i][0], n);

      answer = Math.min(answer, Math.abs(a - b));
    }

    return answer;
  }

  private int bfs(int w1, int w2, int n) {
    Queue<Integer> queue = new LinkedList<>();
    boolean[] visit = new boolean[n+1];

    int cnt = 0;

    queue.add(w1);
    visit[w1] = true;

    while (!queue.isEmpty()) {
      int cur = queue.poll();
      cnt++;

      for (int next : list[cur]) {
        if(next != w2 && !visit[next]) {
          queue.add(next);
          visit[next] = true;
        }
      }
    }
    return cnt;
  }

  @Test
  public void solution() {
    int[][] wires = {{1,3}, {2,3}, {3, 4}, {4, 5}, {4, 6}, {4, 7}, {7, 8}, {7, 9}};
    Assert.assertEquals(3, solution(9, wires));
  }
}
