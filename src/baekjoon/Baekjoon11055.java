package baekjoon;

import java.util.Scanner;

public class Baekjoon11055 {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    if (N > 1000 || N < 1) {
      return;
    }
    int[][] dp = new int[N][2];

    int max = 0;

    for (int i = 0; i < N; i++) {
      dp[i][0] = dp[0][1];
      dp[i][1] = scan.nextInt();
      if (dp[i][1] > 1000 || dp[i][1] < 1) {
        return;
      }

      dp[i][0] = dp[0][1];

      for (int ii = 0; ii < i; ii++) {
        if (dp[ii][1] < dp[i][1]) {
          dp[i][0] = Math.max(dp[i][0], dp[ii][0] + dp[i][1]);
        }
      }

      max = max < dp[i][0] ? dp[i][0] : max;

    }

    System.out.println(max);

  }

}
