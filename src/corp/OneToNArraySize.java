package corp;

import java.util.Scanner;

/**
 * Created by nttej on 2017-10-24.
 */
// One To N is different value equal true, if 1 more same value is false
// N is Array Size
// 4 >> [1, 4, 3, 2] = ture , 3 >> [1 ,3, 4] false , 4 >> [1, 4, 2, 2] false

public class OneToNArraySize {


  public boolean solution(int[] arr) {

    boolean answer = true;

    int[] data = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {

      if (arr.length < arr[i]) {

        return false;

      }

      data[arr[i] - 1] = arr[i];

    }

    for (int j = 1; j < arr.length; j++) {

      if (data[j] == 0) {

        return false;

      }

    }

    return answer;

  }

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("input digit");
    int digit = scanner.nextInt();

    int[] inputArr = new int[digit];

    for (int i = 0; i < digit; i++) {

      System.out.println(i + " array value input ");

      inputArr[i] = scanner.nextInt();

    }

    OneToNArraySize oneToNArraySize = new OneToNArraySize();

    System.out.println(oneToNArraySize.solution(inputArr));

  }

}

