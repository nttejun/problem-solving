package programmers;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class SearchLv1Exam {

  public int[] solution(int[] answers) {
    int[] answer = {};

    int[] first = new int[]{1, 2, 3, 4, 5};
    int[] second = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
    int[] third = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

    int[] score = new int[3];

    for (int i = 0; i < answers.length; i++) {
      if (answers[i] == first[i % 5]) {
        score[0]++;
      }
      if (answers[i] == second[i % 8]) {
        score[1]++;
      }
      if (answers[i] == third[i % 10]) {
        score[2]++;
      }
    }

    List<Integer> list = new ArrayList<>();
    int max = Math.max(Math.max(score[0], score[1]), score[2]);

    if (max == score[0]) {
      list.add(1);
    }
    if (max == score[1]) {
      list.add(2);
    }
    if (max == score[2]) {
      list.add(3);
    }

    answer = new int[list.size()];
    for (int i = 0 ; i < list.size(); i++) {
      answer[i] = list.get(i);
    }

    return answer;
  }

  @Test
  public void TEST_성공테스트() {
    //int[] answer = new int[]{1, 2, 3, 4, 5};
    int[] answer1 = new int[]{1, 3, 2, 4, 2};
    //solution(answer);
    solution(answer1);
  }
}
