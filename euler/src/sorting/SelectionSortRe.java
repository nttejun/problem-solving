package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class SelectionSortRe {

    public int[] sortingSelection(int[] testValue) {

        int min, temp;
        int minIndex = 0;

        for (int i = 0; i < testValue.length; i++) {
            min = testValue[i];
            minIndex = i;

            for (int j = i + 1; j < testValue.length; j++) {
                if (min > testValue[j]) {
                    min = testValue[j];
                    minIndex = j;
                }
            }

            temp = testValue[i];
            testValue[i] = min;
            testValue[minIndex] = temp;

        }

        return testValue;

    }

    @Test
    public void test_selectionSorting() {
        int[] testValue = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        int[] result = sortingSelection(testValue);
        for(int i = 0; i < result.length; i++){
            assertEquals(i+1, result[i]);
        }
    }
}

