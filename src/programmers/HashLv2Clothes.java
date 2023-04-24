package programmers;

import org.junit.Assert;
import org.junit.Test;

public class HashLv2Clothes {
    public int solution(String[][] clothes) {
        int answer = 0;
        return answer;
    }

    @Test
    public void TEST_성공케이스_1() {
        String[][] clothes = new String[3][3];
        clothes[0][0] = "crow_mask";
        clothes[0][1] = "face";
        clothes[1][0] = "blue_sunglasses";
        clothes[1][1] = "face";
        clothes[2][1] = "smoky_makeup";
        clothes[2][2] = "face";
        Assert.assertEquals(solution(clothes), 3);
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
        Assert.assertEquals(solution(clothes), 5);
    }
}
