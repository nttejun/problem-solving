package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProgLevel1KValue {

  public int[] solution(int[] array, int[][] commands) {
    int[] answer = new int[commands.length];

    for (int i = 0; i < commands.length; i++) {
      int start = commands[i][0];
      int end = commands[i][1];

      List<Integer> list = new ArrayList();

      for (int j = start - 1; j < end; j++) {
        list.add(array[j]);
      }

      Collections.sort(list);

      int k = commands[i][2];

      answer[i] = list.get(k - 1);

      System.out.println(answer[i]);
    }
    return answer;
  }

  public int[] solution1(int[] array, int[][] commands) {

    int[] answer = new int[commands.length];

    for (int i = 0; i < commands.length; i++) {
      int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
      Arrays.sort(temp);
      answer[i] = temp[commands[i][2] - 1];
      System.out.println(answer[i]);
    }

    return answer;

  }

  public static void main(String[] args) {

    int ary[] = {1, 5, 2, 6, 3, 7, 4};
    int com[][] = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

    ProgLevel1KValue p = new ProgLevel1KValue();
    p.solution1(ary, com);
  }

}
