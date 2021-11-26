package baekjoon;

import java.util.Scanner;

public class Baekjoon1003 {

  private static int one = 0;
  private static int zero = 0;

  public static void main(String[] args) {

    Baekjoon1003 baekjoon1003 = new Baekjoon1003();
    baekjoon1003.start();

  }

  public void start() {

    Scanner scan = new Scanner(System.in);

    int T = scan.nextInt();
    int N[] = new int[T];
    int n = 0;

    for (int i = 0; i < T; i++) {

      n = scan.nextInt();

      if (n < 0 || n > 40) {
        return;
      }

      N[i] = n;

    }

    Baekjoon1003 baekjoon1003 = new Baekjoon1003();

    for (int i = 0; i < T; i++) {
      zero = 0;
      one = 0;
      baekjoon1003.fibonacci(N[i]);
      System.out.println(zero + " " + one);
    }
  }

  public int fibonacci(int n) {
    if (n == 1) {
      one++;
      return 0;
    } else if (n == 0) {
      zero++;
      return 0;
    } else {
      return fibonacci(n - 1) + fibonacci(n - 2);
    }
  }
}
