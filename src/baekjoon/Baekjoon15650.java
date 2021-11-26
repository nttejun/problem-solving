package baekjoon;

import java.util.Scanner;

public class Baekjoon15650 {
  static int N, M;
  static int[] arr = new int[20];
  static boolean[] isUsed = new boolean[20];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    M = sc.nextInt();
    dfs(0, -1);

  }

  private static void dfs(int idx, int prevNum) {
    if (idx == M) {
      for (int i = 0; i < M; i++) {
        System.out.print(arr[i] + " ");
      }
      System.out.println();
      return;
    }

    for (int j = 1; j <= N; j++) {
      if (!isUsed[j]) {
        if(prevNum > j) {
          continue;
        } else {
          isUsed[j] = true;
          arr[idx] = j;
          dfs(idx + 1, arr[idx]);
          isUsed[j] = false;
        }
      }
    }
  }
}
