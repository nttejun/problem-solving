package baekjoon;

import java.util.Scanner;

public class Baekjoon10871 {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int count = scan.nextInt();

    int x = scan.nextInt();

    int[] seqVal = new int[count];

    for (int n = 0; n < count; n++) {
      seqVal[n] = scan.nextInt();
    }

    for (int val : seqVal) {

      if (x > val) {

        System.out.print(val + " ");

      }
    }

  }
}
