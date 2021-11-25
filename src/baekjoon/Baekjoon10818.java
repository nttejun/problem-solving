package baekjoon;

import java.util.Scanner;

public class Baekjoon10818 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int max = -99999;
    int min = 99999;
    int n = sc.nextInt();
    int[] arr = new int[n];

    for(int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
      if (max < arr[i]) {
        max = arr[i];
      }

      if (min > arr[i]) {
        min = arr[i];
      }
    }

    System.out.println(min + " " + max);
  }
}
