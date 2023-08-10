package programmers;

import java.util.LinkedList;
import java.util.Queue;
import org.junit.Assert;
import org.junit.Test;

public class DfsBfsLv3Network {
  static boolean[] visit;
  static Queue<Integer> queue = new LinkedList<>();

  public int solution(int n, int[][] computers) {
    int answer = 0;
    visit = new boolean[n];

    // bfs 수행하면 연결되어 있는 네트워크는 visit[i] = true 상태이므로, 연결되지 않은 컴퓨터만 bfs 진행하고 카운트 + 1 한다
    for(int i=0; i<n; i++) {
      if(visit[i] == false) {
        bfs(i, computers, n);
        answer++;
      }
    }
    return answer;
  }

  // bfs 안에서 네트워크 연결된 컴퓨터는 visit[i] = true 설정으로 변경한다
  public void bfs(int i, int[][] computers, int n){
    queue.offer(i);
    visit[i] = true;

    while (!queue.isEmpty()) {
      int value = queue.poll();
      // 방문한 적이 없으며, 연결되어 있다면
      // 방문 체크, queue 추가
      for (int j=0; j<n; j++) {
        if (visit[j] == false && computers[value][j] == 1) {
          visit[j] = true;
          queue.offer(j);
        }
      }
    }
  }

  public int solutionDfs(int n, int[][] computers) {
    int answer = 0;
    visit = new boolean[n];

    for (int i=0; i<n; i++) {
      if(visit[i] == false) {
        answer++;
        dfs(i, computers, n);
      }
    }
    return answer;
  }

  public void dfs(int i, int[][] computers, int n){
    visit[i] = true;

    for(int j=0; j<n; j++) {
      if(visit[j] == false && computers[i][j] == 1) {
        dfs(j,computers, n);
      }
    }
  }

  @Test
  public void solution() {
    int[][] computers = new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
    Assert.assertEquals(2, solution(3, computers));
  }
}
