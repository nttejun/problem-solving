package programmers;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class StackQueueLv2FunctionDevelop {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> q = new ConcurrentLinkedDeque<>();
        for(int i=0; i<progresses.length; i++){
            q.add((100-progresses[i]) % speeds[i] == 0
                    ? (100-progresses[i]) / speeds[i]
                    : (100-progresses[i]) / speeds[i] + 1
            );
        }

        List<Integer> result = new ArrayList<>();
        int standard = q.poll();
        int cnt = 1;

        while (!q.isEmpty()){
            int num = q.poll();
            if(standard >= num){
                cnt++;
            } else {
                result.add(cnt);
                cnt = 1;
                standard = num;
            }
        }

        result.add(cnt);
        int[] answer = new int[result.size()];

        for(int i=0; i<answer.length; i++){
            answer[i] = result.get(i);
        }
        return answer;
    }

    @Test
    public void solution() {
        StackQueueLv2FunctionDevelop stackQueueLv2FunctionDevelop = new StackQueueLv2FunctionDevelop();
        int[] progress = new int[]{93, 30, 55};
        int[] speeds = new int[]{1, 30, 5};
        stackQueueLv2FunctionDevelop.solution(progress, speeds);
    }
}
