package programmers;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.junit.Assert;
import org.junit.Test;

// 인접리스트로 해결 가능한 문제
public class SearchLv2PowerGrid {

  public List<Integer>[] list;

  public int solution(int n, int[][] wires) {
    int answer = 100;

    // 송전탑 리스트 만들고
    list = new List[n + 1];
    for (int i = 0; i <= n; i++) {
      list[i] = new ArrayList<>();
    }

    // 송전탑 리스트에 인접한 송전탑 리스트를 추가해준다
    for (int[] wire : wires) {
      list[wire[0]].add(wire[1]);
      list[wire[1]].add(wire[0]);
    }

    // 절대값이 가장 낮은 숫자
    for (int[] wire : wires) {
      int n1 = bfs(wire[0], wire[1], n);
      int n2 = bfs(wire[1], wire[0], n);

      answer = Math.min(answer, Math.abs(n1 - n2));
    }

    return answer;
  }

  public int bfs(int v1, int v2, int n) {
    Queue<Integer> queue = new LinkedList<>();
    boolean[] visit = new boolean[n + 1];

    int cnt = 0;

    queue.add(v1);
    visit[v1] = true;

    while (!queue.isEmpty()) {
      int cur = queue.poll();
      cnt++;

      for(int next : list[cur]) {
        if(next != v2 && !visit[next]) {
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
    System.out.println(wires[3][0]);
    System.out.println(wires[3][1]);
    Assert.assertEquals(3, solution(9, wires));
  }
}
