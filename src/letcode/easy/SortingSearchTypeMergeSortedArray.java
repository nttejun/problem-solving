package letcode.easy;

import java.util.Arrays;
import org.junit.Test;

public class SortingSearchTypeMergeSortedArray {

  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int[] temp = new int[m + n];
    for (int i = 0; i < m; i++) {
      temp[i] = nums1[i];
    }

    int count = 0;
    for (int i = m; i < m + n; i++) {
      temp[i] = nums2[count++];
    }

    Arrays.sort(temp);

    for (int i = 0; i < m + n; i++) {
      nums1[i] = temp[i];
    }
  }

  @Test
  public void TEST_CASE_1() {
    int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
    int[] nums2 = new int[]{2, 5, 6};
    int m = 3;
    int n = 3;
    int[] expected = new int[]{1, 2, 2, 3, 5, 6};
    merge(nums1, m, nums2, n);
  }

  @Test
  public void TEST_CASE_2() {
    int[] nums1 = new int[]{1};
    int[] nums2 = new int[]{};
    int m = 1;
    int n = 0;
    int[] expected = new int[]{1};
    merge(nums1, m, nums2, n);
  }

  @Test
  public void TEST_CASE_3() {
    int[] nums1 = new int[]{0};
    int[] nums2 = new int[]{1};
    int m = 0;
    int n = 1;
    int[] expected = new int[]{1};
    merge(nums1, m, nums2, n);
  }
}
