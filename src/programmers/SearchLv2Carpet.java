package programmers;

import org.junit.Assert;
import org.junit.Test;

public class SearchLv2Carpet {

  static int brownRow;
  static int brownCol;

  public int[] solution(int brown, int yellow) {
    carpet(brown, yellow);

    int answer[] = new int[2];
    answer[0] = brownRow;
    answer[1] = brownCol;

    return answer;
  }

  private void carpet(int brown, int yellow) {
    for (int i = 1; i <= yellow; i++) {
      int yellowRow = yellow/i;
      int yellowCol = i;
      brownRow = 0;
      brownCol = 0;

      if (yellowRow >= yellowCol) {
        if(yellow % yellowRow > 0) {
          yellowCol++;
        }

        brownRow = yellowRow + 2;
        brownCol = yellowCol + 2;

        System.out.println(brownRow + " --- " + brownCol);

        if((brownRow * brownCol) == (brown + yellow)) {
          return;
        }
      }
      else {
        return;
      }
    }
  }

  public int[] solutionNormal(int brown, int yellow) {
    int[] answer = new int[2];
    int area = brown + yellow;

    for (int i = 1; i <= area; i++) {
      int row = i;
      int col = area / row;

      if (row > col)
        continue;

      // yellow 크기를 구할 때, 노랑은 갈색 테두리 안에 위치하기 때문에 가로 -2, 세로 -2 조건에 해당되어야 한다
      if ((row - 2) * (col - 2) == yellow) {
        answer[0] = col;
        answer[1] = row;
        return answer;
      }
    }

    return answer;
  }

  @Test
  public void solution() {
    int[] answer = solution(24, 24);
    Assert.assertEquals("8 , 6", answer[0] + " , " + answer[1]);

    answer = solution(10, 2);
    Assert.assertEquals("4 , 3", answer[0] + " , " + answer[1]);
  }
}
