package resolve;

import java.util.Scanner;

/*

2xn 타일 2x1 , 1x2로 채워간다

2×n 크기의 직사각형 채우는 방법의 수 / 10,007 = 나머지 출력

2x1, 1x2 타일 규칙 >> n = n-1 case + n-2 case

 */

public class Backjoon11726 {

    public static int[] dp = new int[2001];

    public static int tile(int n) {

        if (n < 2) {    // 마지막 d[n] 값 처리 [1].[2]

            return dp[n] = 1;

        }

        if (dp[n] > 0) {    // 이미 저장된 경우다

            return dp[n];   // reading

        } else {

            dp[n] = (tile(n - 1) + tile(n - 2))%10007;  // tile(n - 1) >> 메소드반복 + tile(n - 2) >> 메소드반복 >> 종료된 값 = dp[n]

            return dp[n];

        }

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Backjoon11726 backjoon11726 = new Backjoon11726();
        System.out.println(backjoon11726.tile(n));
    }
}
