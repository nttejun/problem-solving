package baekjoon;

import java.util.Scanner;

public class Baekjoon1920 {

  static int N;
  static int[] arr;
  static int[] tmp;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    arr = new int[N];
    tmp = new int[N];

    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }

    mergeSort(0, N-1);
    //bubbleSort();

    for (int l : arr) {
      System.out.println(l);
    }
  }

  private static void mergeSort(int start, int end) {
    if (start < end) {
      int mid = (start+end)/2;
      mergeSort(start, mid);
      mergeSort(mid+1, end);

      int tmpStart = start;
      int tmpMid = mid + 1;
      int index = tmpStart;

      while (tmpStart <= mid || tmpMid <= end) {
        if (tmpMid > end || (tmpStart <= mid && arr[tmpStart] < arr[tmpMid])){
          tmp[index++] = arr[tmpStart++];
        } else {
          tmp[index++] = arr[tmpMid++];
        }
      }

      for (int i = start; i <= end; i++) {
        arr[i] = tmp[i];
      }

    }
  }

  private static void bubbleSort() {
    int temp;
    for (int i = N-1; i > 0; i--) {
      for (int j = 0; j < N-1; j++) {
        if (arr[j] > arr[j+1]) {
          temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
  }
}
