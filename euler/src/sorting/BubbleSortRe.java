package sorting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BubbleSortRe {

    public int[] bubbleSorting(int[] unsortValue) {

        int temp;
        for(int i=0; i<unsortValue.length; i++){
            temp = unsortValue[i];
            for(int j=i+1; j<unsortValue.length; j++){
                if(temp > unsortValue[j]){
                    unsortValue[i] = unsortValue[j];
                    unsortValue[j] = temp;
                    temp = unsortValue[i];
                }
            }
        }
        return unsortValue;
    }


    @Test
    public void test_bubbleSorting() {
        int[] unsortValue = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
        int[] sortedValue = bubbleSorting(unsortValue);
        for(int i = 0; i < sortedValue.length; i++){
            assertEquals(i+1, sortedValue[i]);
        }
    }
}


