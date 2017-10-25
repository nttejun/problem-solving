package resolve;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by nttej on 2017-10-20.
 */

public class Backjoon1463 {

    static int[] d;

    public static int start(int n) {

        if (n == 1) {
            return 0;
        }

        d[n] = start(n - 1) + 1;

        if (n % 3 == 0) {
            int temp = d[n / 3];
            if (temp < d[n]) {
                d[n] = temp + 1;
            }
        }

        if (n % 2 == 0) {
            int temp = d[n / 2];
            if (temp < d[n]) {
                d[n] = temp + 1;
            }
        }

        return d[n];
    }

    // -1 로 d[i]를 먼저 만들고
    // 2로 나눠지고 d[i]가 2로 나눈 값보다 크면 d[i]는 2으로 나눈 값으로 교체
    // 3로 나눠지고 d[i]가 3로 나눈 값보다 크면 d[i]는 3으로 나눈 값으로 교체
    public static int bottomUp(int n) {

        int result = 0;

        d[1] = 0;

        for (int i = 2; i <= n; i++) {

            d[i] = d[i - 1] + 1;

            if (i % 2 == 0 && d[i] > d[i / 2] + 1) {
                d[i] = d[i / 2] + 1;
            }

            if (i % 3 == 0 && d[i] > d[i / 3] + 1) {
                d[i] = d[i / 3] + 1;
            }

            result = d[i];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n < 0 || n > 1000000) {
            n = scanner.nextInt();
        }

        d = new int[n + 1];

        Backjoon1463 backjoon1436 = new Backjoon1463();

        System.out.println(backjoon1436.bottomUp(n));

    }
}
