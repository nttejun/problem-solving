package resolve;

import java.util.Scanner;

public class Baekjoon1300 {

    private static long N = 0;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        N = scan.nextInt();
        int K = scan.nextInt();

        long answer = 0;

        long mid = 0;

        long low = 1;
        long high = Math.min(N*N, 1000000000L);

        while (low <= high) {

            mid = (low + high) / 2;

            int res = 0;
            for (int i = 1; i <= N; i++) {
                res += Math.min(N, mid / i);
            }

            if (res >= K) {
                high = mid - 1;
                answer = mid;
            } else {
                low = mid + 1;
            }
        }

        System.out.println(answer);

    }

    private static long f(long mid) {

        int res = 0;

        // 1부터 n까지 더해준 값을 mid로 만들고 함수 실행
        for (int i = 1; i <= N; i++) {
            res += Math.min(N, mid / i);
        }
        return res;
    }
}

