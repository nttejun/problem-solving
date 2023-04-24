package programmers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;


// 각자 아무것도 없는 경우의 수를 가정해야 하기 때문에 1씩 더해서 곱해주고, 마지막에 아무것도 안입는 경우의 수 1을 빼줘야 한다.
// https://school.programmers.co.kr/learn/courses/30/lessons/42578?language=java
public class HashLv2Clothes {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < clothes.length; i++) {
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0)+1);
        }

        int answer = 1;
        Iterator<Integer> iter = map.values().iterator();
        while(iter.hasNext()) {
            answer *= iter.next().intValue() + 1;
        }

        return answer-1;
    }

    @Test
    public void TEST_성공케이스_1() {
        String[][] clothes = new String[3][3];
        clothes[0][0] = "crow_mask";
        clothes[0][1] = "face";
        clothes[1][0] = "blue_sunglasses";
        clothes[1][1] = "face";
        clothes[2][0] = "smoky_makeup";
        clothes[2][1] = "face";
        Assert.assertEquals(3, solution(clothes));
    }

    @Test
    public void TEST_성공케이스_2() {
        String[][] clothes = new String[3][2];
        clothes[0][0] = "yellow_hat";
        clothes[0][1] = "headgear";
        clothes[1][0] = "blue_sunglasses";
        clothes[1][1] = "eyewear";
        clothes[2][0] = "green_turban";
        clothes[2][1] = "headgear";
        Assert.assertEquals(5, solution(clothes));
    }
}
