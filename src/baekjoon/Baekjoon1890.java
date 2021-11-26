package baekjoon;

import java.util.Scanner;

// 시간초과 버전
public class Baekjoon1890 {

  private static int N = 0;
  private static int[][] board;
  private static int count = 0;

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    N = scan.nextInt();
    board = new int[N][N];

    N = N - 1;

    // 보드 입력
    for (int i = 0; i <= N; i++) {
      for (int ii = 0; ii <= N; ii++) {
        board[i][ii] = scan.nextInt();
      }
    }

    board[N][N] = 0;

    Baekjoon1890 baekjoon1890 = new Baekjoon1890();
    baekjoon1890.move(0, 0, board[0][0]);
    System.out.println(count);
  }

  // width, h, 이동값
  public int move(int h, int w, int val) {

    if (h == N && w == N) {
      return count++;
    } else if (h + val > N && w + val > N) {
      return 0;
    } else if (val == 0) {
      return 0;
    } else if (h + val <= N && w + val <= N) {
      return move(h + val, w, board[h + val][w]) + move(h, w + val, board[h][w + val]);
    } else if (w + val > N) {
      return move(h + val, w, board[h + val][w]);
    } else if (h + val > N) {
      return move(h, w + val, board[h][w + val]);
    } else {
      return 0;
    }
  }
}
