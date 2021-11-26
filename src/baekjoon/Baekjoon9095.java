package baekjoon;

import java.io.*;

/**
 * Created by nttej on 2017-10-13.
 */
// Backjoon 9095
// 1 +,  2 +,  3 + = n case
public class Baekjoon9095 {

  private static int addCheck(int num) {

    if (num == 0) {
      return 1;
    } else if (num < 0) {
      return 0;
    } else {
      int sum = 0;
      for (int i = 3; i > 0; i--) {
        sum += addCheck(num - i);
      }
      return sum;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Baekjoon9095 addDigit = new Baekjoon9095();

    int T = Integer.parseInt(br.readLine());

    for (int i = 0; i < T; i++) {

      int inputNumber = Integer.parseInt(br.readLine());
      System.out.println(addDigit.addCheck(inputNumber));

    }
  }
}

