package baekjoon;

import java.util.Scanner;

public class Baekjoon2750 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] arr = new int[N];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = scanner.nextInt();
    }

    mergeSort(arr, arr.length);

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }

  private static void mergeSort(int[] arr, int length) {
    if (length < 2) { return; }

    int mid = length / 2;
    int[] leftArr = new int[mid];
    int[] rightArr = new int[length - mid];

    int k = 0;
    for ( int i = 0; i < length; i++) {
      if ( i < mid ) {
        leftArr[i] = arr[i];
      } else {
        rightArr[k] = arr[i];
        k = k + 1;
      }
    }

    mergeSort(leftArr, mid);
    mergeSort(rightArr, length - mid);

    /*** mergeSort 재귀가 완료되면 merge 함수 실행 */
    merge(leftArr, rightArr, arr, mid, length - mid);
  }

  private static void merge(int[] leftArr, int[] rightArr, int[] arr, int leftSize, int rightSize) {

    int i = 0, l = 0, r = 0;

    while (l < leftSize && r < rightSize) {
      if (leftArr[l] < rightArr[r]) {
        arr[i++] = leftArr[l++];
      } else {
        arr[i++] = rightArr[r++];
      }
    }

    while (l < leftSize) {
      arr[i++] = leftArr[l++];
    }

    while (r < rightSize) {
      arr[i++] =  rightArr[r++];
    }
  }
}