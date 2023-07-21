package programmers;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StackQueueLv1FunctionDevlop {
    public class Solution {
        public int[] solution(int[] arr) {
            List<Integer> list = new ArrayList<>();
            list.add(arr[0]);
            int value = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] == value) {
                    continue;
                } else {
                    list.add(arr[i]);
                    value = arr[i];
                }
            }
            return list.stream().mapToInt(i -> i).toArray();
        }
    }

    @Test
    public void solution() {
        int[] inputVal = new int[]{1, 1, 3, 3, 0, 1, 1};
        int[] expected = new int[]{1, 3, 0, 1};

        Solution solution = new Solution();
        int[] result = solution.solution(inputVal);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
