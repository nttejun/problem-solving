package programmers;

import java.util.stream.IntStream;
import org.junit.Test;

// 합이 k, 비내림차순 수열을 나타내는 정수배열 sequence, 길이가 짧은 수열, 값이 적은 수
// https://school.programmers.co.kr/learn/courses/30/lessons/178870?language=java#

public class Lv2SumOfContiguousSubarray {

  int[] answer = {};

  public int[] solution(int[] sequence, int k) {
    return answer;
  }

  @Test
  public void TEST_CASE1() {
    answer = new int[]{0, 0};
    int[] sequence = new int[]{2, 2, 2, 2, 2};
    int k = 6;

    for (int i = 0; i < sequence.length; i++) {
      if (sequence[i] == k) {
        answer = new int[]{i, i};
        getResult(answer[i], answer[i]);
        return;
      }
    }

    for (int i = 0; i < sequence.length; i++) {
      for (int j = 0; j < i; j++) {
        int sum = sum(sequence, j, i);
        if (!isRenew(answer, sequence, k, i, j, sum)) {
          break;
        }
      }
    }

    getResult(answer[0], answer[1]);
  }

  private boolean isRenew(int[] answer, int[] sequence, int k, int i, int j, int sum) {
    if (sum == k) {
      // 길이가 짧으면 갱신
      if (answer[1] - answer[0] > j - i) {
        this.answer = new int[]{j, i};
        return true;

      } else if (answer[1] - answer[0] == j - i) {
        // 길이가 같다면 숫자가 작으면 갱신
        if (sequence[0] + sequence[1] > sequence[i] + sequence[j]) {
          this.answer = new int[]{j, i};
          return true;
        }
      }
    }
    return false;
  }

  private int sum(int[] sequence, int start, int end) {
    return IntStream.rangeClosed(start, end)
        .map(i -> sequence[i])
        .sum();
  }

  private void getResult(int start, int end) {
    System.out.println(start + " / " + end);
  }
}
