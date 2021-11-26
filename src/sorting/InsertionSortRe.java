package sorting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InsertionSortRe {

  public int[] insertionSort(int[] unsortValue) {

    int temp;

    for (int i = 1; i < unsortValue.length; i++) {
      for (int j = i; j > 0; j--) {
        if (unsortValue[j] < unsortValue[j - 1]) {
          temp = unsortValue[j - 1];
          unsortValue[j - 1] = unsortValue[j];
          unsortValue[j] = temp;
        } else {
          break;
        }
      }
    }
    return unsortValue;
  }

  @Test
  public void test_insertionSortTest() {
    int[] unsortValue = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
    int[] sortedValue = insertionSort(unsortValue);
    for (int i = 0; i < sortedValue.length; i++) {
      assertEquals(i + 1, sortedValue[i]);
    }
  }

}
