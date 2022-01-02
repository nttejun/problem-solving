package letcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;

public class ArrayTypeIntersectionTwoArrays {
  public int[] intersect(int[] nums1, int[] nums2) {
    Map<Integer, Integer> map = new HashMap<>();
    List<Integer> intersectNums = new ArrayList<>();
    for (int i = 0; i < nums1.length; i++) {
      map.put(nums1[i], 1);
    }

    for (int i = 0; i < nums2.length; i++) {
      if (map.get(nums2[i]) != null) {
        intersectNums.add(nums2[i]);
      }
    }
    return intersectNums.stream().mapToInt(n -> n).toArray();
  }

  @Test
  public void intersectionTwoArray_테스트_CASE1() {
    int[] numsFirst = {1, 2, 2, 1};
    int[] numsSeconds = {2, 2};
    String result = "";
    for (int i : intersect(numsFirst, numsSeconds)) {
      result += i;
    }
    Assert.assertEquals("22", result);
  }

  @Test
  public void intersectionTwoArray_테스트_CASE2() {
    int[] numsFirst = {4, 9, 5};
    int[] numsSeconds = {9, 4, 9, 8, 4};
    String result = "";
    for (int i : intersect(numsFirst, numsSeconds)) {
      result += i;
    }
    Assert.assertEquals("49", result);
  }
}
