package sorting;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nttej on 2017-08-29.
 */

public class BucketSort {

    public void sorting(int[] inputList) {

        int max = maxValue(inputList);
        List<List<Integer>> bucket = bucketMake();
        double divider = dividerValue(max, bucket);
        resultPrint(insertionSort(inBucket(bucket, inputList, divider), inputList));

    }

    public int maxValue(int[] inputList){

        int max = inputList[0];

        for(int index = 0; index < inputList.length; index++){

            if(inputList[index] > max){

                max = inputList[index];

            }

        }

        return max;

    }

    public List<List<Integer>> bucketMake(){

        int bucketSize = 10;

        List<List <Integer>> bucket = new ArrayList<>(bucketSize);

        for(int index = 0 ; index < bucketSize; index++){

            bucket.add(new ArrayList<>());

        }

        return bucket;

    }

    public double dividerValue(int maxValue, List<List<Integer>> bucket) {

        double divider = (double) (maxValue + 1) / bucket.size();

        return divider;

    }

    public List<List<Integer>> inBucket(List<List<Integer>> bucket, int[] inputList, double divider){

        int[] array = new int[bucket.size()];

        for(int index = 0; index < inputList.length; index++){

            double calculationDouble = (double) inputList[index] / divider;

            int calculationInt = (int) calculationDouble;

            bucket.get(calculationInt).add(inputList[index]);

        }

        return bucket;

    }

        public int[] insertionSort(List<List<Integer>> bucket, int[] inputList){

        int[] sortedArray = new int[inputList.length];

        int count = 0;

        for(int index = 0; index < bucket.size(); index++){

            for(int indexList = 0; indexList < bucket.get(index).size(); indexList++){

                int key = bucket.get(index).get(indexList);

                for(int a = indexList + 1; a < bucket.get(index).size(); a++ ){

                    if(key > bucket.get(index).get(a)){

                        bucket.get(index).remove(indexList);

                        bucket.get(index).add(a);

                        bucket.get(index).remove(a);

                        bucket.get(index).add(key);

                        }

                    }

                sortedArray[count++] = bucket.get(index).get(indexList);

            }

        }

        return sortedArray;

    }

    public void resultPrint(int[] sortedArray){

        for(int index = 0; index < sortedArray.length; index++){

            System.out.println("bucket["+ index + "] = " + sortedArray[index]);

        }

    }

    public static void main(String[] args){

        int[] inputList = {1, 3, 5, 6, 24, 4, 10, 8};

        BucketSort bucketSort = new BucketSort();

        bucketSort.sorting(inputList);

    }

}
