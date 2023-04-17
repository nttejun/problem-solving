package programmers;

import java.util.stream.IntStream;
import org.junit.Assert;
import org.junit.Test;

// 합이 k, 비내림차순 수열을 나타내는 정수배열 sequence, 길이가 짧은 수열, 값이 적은 수
// https://school.programmers.co.kr/learn/courses/30/lessons/178870?language=java#

public class Lv2SumOfContiguousSubarray {


  public int[] solution(int[] sequence, int k) {
    int[] answer = {};
    answer = new int[]{0, 0};

    for (int i = 0; i < sequence.length; i++) {
      if (sequence[i] == k) {
        answer = new int[]{i, i};
        printResult(answer[i], answer[i]);
        return null;
      }
    }

    for (int i = 0; i < sequence.length; i++) {
      for (int j = 0; j < i; j++) {
        int sum = sum(sequence, j, i);
        int temp[] = isRenew(answer, sequence, k, i, j, sum);
        if (temp != null) {
          answer = temp;
          break;
        }
      }
    }

    printResult(answer[0], answer[1]);
    return answer;
  }

  public int[] solutionAllPass(int[] sequence, int k) {
    int left = 0;
    int right = 0;
    int sum = 0;
    int size = sequence.length;
    int answerFirst = 0;
    int answerSecond = 0;

    for (right = 0; right < sequence.length; right++) {
      sum += sequence[right];

      while (sum > k) {
        sum -= sequence[left];
        left++;
      }

      if (sum == k) {
        if (size > right - left) {
          size = right - left;
          answerFirst = left;
          answerSecond = right;
        } else if (size == right - left) {
          answerFirst = Math.min(answerFirst, left);
          answerSecond = Math.min(answerSecond, right);
        }
      }
    }
    return new int[]{answerFirst, answerSecond};
  }

  private int[] isRenew(int[] answer, int[] sequence, int k, int i, int j, int sum) {
    if (sum == k) {
      // 길이가 짧으면 갱신
      if (answer[1] - answer[0] > j - i) {
        return new int[]{j, i};
      } else if (answer[1] - answer[0] == j - i) {
        // 길이가 같다면 숫자가 작으면 갱신
        if (sequence[0] + sequence[1] > sequence[i] + sequence[j]) {
          return new int[]{j, i};
        }
      }
    }
    return null;
  }

  private int sum(int[] sequence, int start, int end) {
    return IntStream.rangeClosed(start, end)
        .map(i -> sequence[i])
        .sum();
  }

  private void printResult(int start, int end) {
    System.out.println(start + ", " + end);
  }

  private String getResultStr(int start, int end) {
    return start + ", " + end;
  }

  @Test
  public void TEST_CASE1() {
    int[] sequence = new int[]{2, 2, 2, 2, 2};
    int k = 6;

    int[] solution = solution(sequence, k);
    Assert.assertEquals("0, 2", getResultStr(solution[0], solution[1]));
  }

  @Test
  public void TEST_CASE2() {
    int[] sequence = new int[]{1, 2, 3, 4, 5};
    int k = 7;

    int[] solution = solution(sequence, k);
    Assert.assertEquals("2, 3", getResultStr(solution[0], solution[1]));
  }

  @Test
  public void TEST_CASE3() {
    int[] sequence = new int[]{1, 1, 1, 2, 3, 4, 5};
    int k = 5;

    int[] solution = solution(sequence, k);
    Assert.assertEquals("6, 6", getResultStr(solution[0], solution[1]));
  }
  @Test
  public void TEST_CASE4() {
    int[] sequence = new int[]{2, 2, 2, 2, 2};
    int k = 6;

    int[] solution = solutionAllPass(sequence, k);
    Assert.assertEquals("0, 2", getResultStr(solution[0], solution[1]));
  }

  @Test
  public void TEST_CASE5() {
    int[] sequence = new int[]{1, 2, 3, 4, 5};
    int k = 7;

    int[] solution = solutionAllPass(sequence, k);
    Assert.assertEquals("2, 3", getResultStr(solution[0], solution[1]));
  }

  @Test
  public void TEST_CASE6() {
    int[] sequence = new int[]{1, 1, 1, 2, 3, 4, 5};
    int k = 5;

    int[] solution = solutionAllPass(sequence, k);
    Assert.assertEquals("6, 6", getResultStr(solution[0], solution[1]));
  }
}
