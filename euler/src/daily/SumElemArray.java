package daily;

import common.DoublyLinkedList;
import org.junit.Assert;
import org.junit.Test;

/***
 * 정수 배열과 정수 S가 주어졌을 때, 원소의 합이 S와 같은 가장 긴 부분 배열을 구하시오.
 * 부분 배열은 배열 내의 연속된 원소들의 집합입니다.
 * Input: [5, 6, -5, 5, 3, 5, 3, -2, 0], S = 8
 * Output: [-5, 5, 3, 5]
 *
 */
public class SumElemArray {

  public String valLongSubArraySum(int a[], int size) {
    int max_so_far = Integer.MIN_VALUE,
        max_ending_here = 0, start = 0, end = 0, s = 0;

    for (int i = 0; i < size; i++) {
      max_ending_here += a[i];

      if (max_so_far < max_ending_here) {
        max_so_far = max_ending_here;
        start = s;
        end = i;
      }

      if (max_ending_here < 0) {
        max_ending_here = 0;
        s = i + 1;
      }
    }
    System.out.println("Maximum contiguous sum is " + max_so_far);
    System.out.println("Starting index " + start);
    System.out.println("Ending index " + end);

    return "";
  }

  @Test
  public void valLongSubArraySum() {
    int[] inputVal = {5, 6, -5, 5, 3, 5, 3, -2, 0};
    int sum = 8;
    Assert.assertEquals("-5, 5, 3, 5", valLongSubArraySum(inputVal, sum));
  }
}
