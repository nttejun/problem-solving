package programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import org.junit.Test;

public class HeapLv3DoublePriorityQueue {

  public int[] solution(String[] operations) {
    int[] answer = new int[2];
    ArrayList<Integer> store = new ArrayList<>();
    PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Comparator.reverseOrder());
    PriorityQueue<Integer> minQueue = new PriorityQueue<>();

    for (String str : operations) {
      String[] parts = str.split("\\s+");
      int num = Integer.parseInt(parts[1]);

      if (parts[0].equals("I")) {
        maxQueue.add(num);
        minQueue.add(num);
        store.add(num);
      } else {
        if (num == -1) {
          maxQueue.remove(minQueue.poll());
        } else {
          minQueue.remove(maxQueue.poll());
        }
      }
    }

    answer[0] = maxQueue.isEmpty() ? 0 : maxQueue.peek();
    answer[1] = minQueue.isEmpty() ? 0 : minQueue.peek();

    return answer;
  }

  @Test
  public void solution() {
    String[] operations = new String[]{"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"};
    solution(operations);
  }
}
