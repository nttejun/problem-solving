package programmers;


import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class HashPocketmon {

    @Test
    public void 포켓몬() {
        int[] nums = new int[]{3, 1, 2, 3};
        int answer = 0;

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.get(String.valueOf(nums[i])) != null) {
                map.put(String.valueOf(nums[i]), map.get(String.valueOf(nums[i])) + 1);
            }
        }

        int count = 0;
        for (int i = 0; i < map.size(); i++) {
            if(map.get(String.valueOf(i)) == 1) {
                count++;
            }
        }

        System.out.println(count);
    }
}

