package sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nttej on 2017-09-04.
 */

public class RadixSort {

    public static final int max = 10;

    public void sorting(int[] inputList){

        int digit = maxDigit(maxDigitValue(inputList));
        List<List<Integer>> bucket = makeBucket(inputList);
        checkDigit(inputList, digit, bucket);

    }

    public int maxDigitValue(int[] inputList){

        int maxValue = 0;

        for(int a = 0; a < inputList.length; a++){

            if(maxValue < inputList[a]){

                maxValue = inputList[a];

            }

        }

        return maxValue;
    }

    public int maxDigit(int maxValue){

        int length = 0 ;

        while(maxValue > 0){

            length++;

            maxValue = maxValue / 10;

        }

        return length;

    }

    public List<List<Integer>> makeBucket(int[] inputList){

        List<List<Integer>> bucket = new ArrayList<>(max);

        for(int a = 0; a < max; a++){

            bucket.add(new ArrayList<>());

        }

        return bucket;

    }

    public void checkDigit(int[] inputList, int length, List<List<Integer>> bucket) {

        int size = length;

        int divideNumber = 1;

        while (size != 0) {

            size --;

            inputDataInBucket(inputList, bucket, divideNumber);

            divideNumber = divideNumber * 10;

        }
    }

    public List<List<Integer>> inputDataInBucket(int[] inputList, List<List<Integer>> bucket, int divideNumber) {

        for (int index = 0; index < inputList.length; index++) {

            bucket.get((inputList[index] / divideNumber) % 10).add(inputList[index]);

        }

        for(int a = 0; a < bucket.size(); a++){
            System.out.println("버킷 인덱스 = " + a);
            for(int b = 0; b < bucket.get(a).size(); b++ ) {
                System.out.println(bucket.get(a).get(b));
            }
        }

        return bucket;
    }



    public void dataOutInBucket(List<List<Integer>> bucket){


    }

    public static void main(String[] args){

        int[] inputList = {999, 22, 555, 33, 46, 88, 11, 0, 9};

        RadixSort radixSort = new RadixSort();

        radixSort.sorting(inputList);

    }
}
