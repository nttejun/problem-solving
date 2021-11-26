package sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nttej on 2017-09-04.
 */

public class RadixSort {

  public static final int max = 10;

  public void sorting(int[] inputList) {

    int digit = maxDigit(maxDigitValue(inputList));
    checkDigit(inputList, digit);

  }

  public int maxDigitValue(int[] inputList) {

    int maxValue = 0;

    for (int a = 0; a < inputList.length; a++) {

      if (maxValue < inputList[a]) {

        maxValue = inputList[a];

      }

    }

    return maxValue;
  }

  public int maxDigit(int maxValue) {

    int length = 0;

    while (maxValue > 0) {

      length++;

      maxValue = maxValue / 10;

    }

    return length;

  }

  public void checkDigit(int[] inputList, int length) {

    int size = length;

    int divideNumber = 1;

    while (size != 0) {

      size--;

      bucketSorting(inputList, divideNumber);

      divideNumber = divideNumber * 10;


    }
  }

  public void bucketSorting(int[] inputList, int divideNumber) {

    printResult(getoutInBucket(inputDataInBucket(inputList, divideNumber), inputList));

  }


  public List<List<Integer>> inputDataInBucket(int[] inputList, int divideNumber) {

    List<List<Integer>> bucket = makeBucket();

    for (int index = 0; index < inputList.length; index++) {

      int bucketData = inputList[index] / divideNumber % 10;

      bucket.get(bucketData).add(inputList[index]);

    }

    return bucket;

  }

  public List<List<Integer>> makeBucket() {

    List<List<Integer>> bucket = new ArrayList<>(max);

    for (int a = 0; a < max; a++) {

      bucket.add(new ArrayList<>());

    }

    return bucket;

  }

  public int[] getoutInBucket(List<List<Integer>> bucket, int[] inputList) {

    int count = 0;

    for (int index = 0; index < bucket.size(); index++) {
      for (int rotation = 0; rotation < bucket.get(index).size(); rotation++) {

        inputList[count] = bucket.get(index).get(rotation);
        count++;

      }

      for (int rotation = 0; rotation < bucket.get(index).size(); rotation++) {

        bucket.get(index).remove(rotation);

      }
    }
    return inputList;
  }

  public void printResult(int[] inputList) {

    for (int index = 0; index < inputList.length; index++) {

      System.out.println("Sorted inputList[" + index + "] = " + inputList[index]);

    }
  }

  public static void main(String[] args) {

    int[] inputList = {9999, 777, 222, 33, 444, 88, 1111, 0};

    RadixSort radixSort = new RadixSort();

    radixSort.sorting(inputList);

  }
}
