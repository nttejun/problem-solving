package programmers;

import java.util.LinkedList;
import java.util.Queue;
import org.junit.Test;

/**
 * 모든 트럭이 다리를 건너는데 소요되는 초 다리 위에 올라갈 수 있는 길이 : bridge_length 다리 위에 올라갈 수 있는 무게 : weigth
 */
public class StackQueueTruckBridge {

  public int solution(int bridge_length, int weight, int[] truck_weights) {
    int answer = 0;

    Queue<Integer> bridge = new LinkedList<>();

    for (int i = 0; i < bridge_length; i++) {
      bridge.offer(0);
    }

    int index = 0;
    int currentWeight = 0;

    while (index < truck_weights.length) {
      currentWeight -= bridge.poll();
      answer++;

      if (currentWeight + truck_weights[index] < weight) {
        bridge.offer(truck_weights[index]);
        currentWeight += truck_weights[index++];
      } else {
        bridge.offer(0);
      }
    }
    return answer + bridge_length;
  }

  public int solutionOtherVersion(int bridge_length, int weight, int[] truck_weights) {
    int answer = 0;
    int sum = 0, i = 0;
    Queue<Integer> q = new LinkedList<>();
    for (int j = 0; j < bridge_length; j++) {
      q.offer(0);
    }

    while (!q.isEmpty()) {
      int popped = q.poll();
      sum -= popped;
      if (i < truck_weights.length) {
        if (sum + truck_weights[i] <= weight) {
          q.offer(truck_weights[i]);
          sum += truck_weights[i];
          i++;
        } else {
          q.offer(0);
        }
      }
      answer++;
    }
    return answer;
  }

  @Test
  public void solution() {
    StackQueueTruckBridge stackQueueTruckBridge = new StackQueueTruckBridge();
    stackQueueTruckBridge.solutionOtherVersion(2, 10, new int[]{7, 4, 5, 6});
  }
}
