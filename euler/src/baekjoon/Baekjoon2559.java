package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon2559 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // 몇칠
        int N = scan.nextInt();

        // 입력받은 N값 검증
        if (N < 2 || N > 100000) return;

        // 연속적인 날짜 수
        int K = scan.nextInt();

        List<Integer> list = new ArrayList<>();

        // 일별 온도 입력
        for (int i = 0; i < N; i++) {
            int tmp = scan.nextInt();
            if (tmp < -100 || tmp > 100) {
                i--;
            } else {
                list.add(tmp);
            }
        }

        int num = 0;

        for (int i = 0; i < K; i++) {
            num = list.get(i) + num;
        }

        int max = num;

        int temp = num;
        for (int i = 0; i < list.size()-K; i++ ) {
            temp = temp - list.get(i) + list.get(K+i);
            if(temp > max){
                max= temp;
            }
        }
        System.out.println(max);
    }
}
