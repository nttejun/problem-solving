package programmers;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.Test;

public class DfsBfsLv3TravelRoute {
  boolean[] visited;
  ArrayList<String> allRoute;

  public String[] solution(String[][] tickets) {
    String[] answer = {};
    int cnt = 0;
    visited = new boolean[tickets.length];
    allRoute = new ArrayList<>();

    dfs("ICN", "ICN", cnt, tickets);

    Collections.sort(allRoute);
    answer = allRoute.get(0).split(" ");

    return answer;
  }

  public void dfs(String start, String route, int cnt, String[][] tickets) {
    if (cnt == tickets.length) {
      allRoute.add(route);
      return;
    }

    for (int i = 0; i < tickets.length; i++) {
      if(!visited[i] && start.equals(tickets[i][0])) {
        visited[i] = true;
        dfs(tickets[i][1], route + " " + tickets[i][1], cnt + 1, tickets);
        visited[i] = false;
      }
    }
  }

  @Test
  public void solution() {
    String[][] str = new String[][]{{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
    solution(str);
  }
}

