package resolve;

import java.util.stream.IntStream;

public class Year2016 {
    public String solution(int a, int b) {
        String[] days = new String[]{"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] endDay29 = {2};
        int[] endDay30 = {4, 6, 9, 11};
        int[] endDay31 = {1, 3, 5, 7, 8, 10, 12};

        int dayCnt = 0;

        if (endDay29.equals(a)){
            dayCnt = 29;
        } else if (endDay30.equals(a)){
            dayCnt = 30;
        } else if (endDay31.equals(a)){
            dayCnt = 31;
        }

        String answer = "";
        return answer;
    }

    public static void main(String[] args){

    }
}
