package resolve;

import java.util.Arrays;

public class ProgLv2PriceDownTime {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        int count = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i+1; j < prices.length; j++) {
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


    public static void main(String[] args) {
        ProgLv2PriceDownTime progLv2PriceDownTIme = new ProgLv2PriceDownTime();
        System.out.println(Arrays.toString(progLv2PriceDownTIme.solution(new int[]{1, 2, 3, 2, 3})));
        System.out.println(Arrays.toString(progLv2PriceDownTIme.solution(new int[]{5, 4, 3, 5, 6, 5})));
    }
}
