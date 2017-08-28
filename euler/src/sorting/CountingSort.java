package sorting;

/**
 * Created by nttej on 2017-08-19.
 */
public class CountingSort {

    public void sorting(int[] inputList) {

        printResult(sortedArray(indexCountAccumulate(makeArray(inputList, max(inputList))), inputList));

    }

    public int max(int[] inputList) {

        int maxValue = inputList[0];

        for (int index = 0; index < inputList.length; index++) {

            if (maxValue < inputList[index]) {

                maxValue = inputList[index];

            }

        }

        return maxValue;

    }

    public int[] makeArray(int[] inputList, int max) {

        int[] arrayMinMax = new int[max + 1];

        for (int index = 0; index < inputList.length; index++) { // index insert

            arrayMinMax[inputList[index]] += 1;

        }

        return arrayMinMax;

    }

    public int[] indexCountAccumulate(int[] arrayMinMax) {

        for (int index = 1; index < arrayMinMax.length; index++) {

            arrayMinMax[index] += arrayMinMax[index - 1]; // index count accumulate

        }

        return arrayMinMax;

    }

    public int[] sortedArray(int[] arrayMinMax, int[] inputList){

        int[] sortArray = new int[inputList.length];

        for (int index = inputList.length - 1; index >= 0; index--) {

            sortArray[--arrayMinMax[inputList[index]]] = inputList[index]; // sorted array

        }

        return sortArray;

    }

    public void printResult(int[] sortArray) {

        for (int index = 0; index < sortArray.length; index++) {

            System.out.println("sortArray[" + index + "] = " + sortArray[index]);

        }

    }

    public static void main(String[] args) {

        int[] inputList = {3, 4, 5, 7, 9, 4};

        CountingSort countingSort = new CountingSort();

        countingSort.sorting(inputList);

    }
}
