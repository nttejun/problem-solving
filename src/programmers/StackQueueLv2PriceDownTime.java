package programmers;

import java.util.Arrays;
import java.util.Stack;

public class StackQueueLv2PriceDownTime {

  public int[] solution(int[] prices) {
    int[] answer = new int[prices.length];
    int count = 0;
    for (int i = 0; i < prices.length - 1; i++) {
      for (int j = i + 1; j < prices.length; j++) {
        if (prices[i] <= prices[j]) {
          count++;
        } else {
          count++;
          break;
        }
      }
      answer[i] = count;
      count = 0;
    }

    return answer;
  }

  public int[] solutionRefactoringVersion(int[] prices) {
    int len = prices.length;
    int[] answer = new int[len];
    int count = 0;
    for (int i = 0; i < len; i++) {
      for (int j = 0; j < len; j++) {
        answer[i]++;
        if (prices[i] <= prices[j])
          break;
      }
    }
    return answer;
  }

  public int[] solution1(int[] prices) {
    Stack<Integer> indexs = new Stack<>();
    int i = 0;
    int[] terms = new int[prices.length];

    indexs.push(i);
    for (i = 1; i < prices.length; i++) {
      while (!indexs.empty() && prices[i] < prices[indexs.peek()]) {
        int index = indexs.pop();
        terms[index] = i - index;
      }
      indexs.push(i);
    }

    while (!indexs.empty()) {
      int index = indexs.pop();
      terms[index] = i - index - 1;
    }

    return terms;
  }

  public static void main(String[] args) {
    StackQueueLv2PriceDownTime progLv2PriceDownTIme = new StackQueueLv2PriceDownTime();
    System.out.println(Arrays.toString(progLv2PriceDownTIme.solution(new int[]{1, 2, 3, 2, 3})));
    System.out.println(Arrays.toString(progLv2PriceDownTIme.solution1(new int[]{1, 2, 3, 2, 3})));
    System.out
        .println(Arrays.toString(progLv2PriceDownTIme.solution1(new int[]{5, 4, 3, 5, 6, 5})));
    System.out
        .println(Arrays.toString(progLv2PriceDownTIme.solution1(new int[]{5, 4, 3, 5, 6, 5})));
  }
}
