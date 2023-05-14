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

  @Test
  public void solution() {
    int[] answer = solution(24, 24);
    Assert.assertEquals("8 , 6", answer[0] + " , " + answer[1]);

    answer = solution(10, 2);
    Assert.assertEquals("4 , 3", answer[0] + " , " + answer[1]);
  }
}
