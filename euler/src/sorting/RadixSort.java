package sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nttej on 2017-09-04.
 */

// 시간복잡도 O(dn)


public class RadixSort {

    public static final int max = 10;
    public static final int infinity = 99999;

    public void sorting(int[] inputList){

        int digit = maxDigit(maxDigitValue(inputList));
        List<List<Integer>> bucket = makeBucket(inputList);

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

        for(int a = 0; a < inputList.length; a++){

            bucket.add(new ArrayList<>());

        }

        return bucket;

    }

    public void inputDataInBuncket(int[] inputList, int length, List<List> bucket){
        
    }

    public void dataOutInBucket(){

    }

    public static void main(String[] args){

        int[] inputList = {999, 22, 555, 33, 46, 88, 11, 0, 9};

        RadixSort radixSort = new RadixSort();
        radixSort.sorting(inputList);

    }
}
