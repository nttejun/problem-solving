package letcode.easy;

import org.junit.Assert;
import org.junit.Test;

public class SortingSearchTypeFirstBadVersion {

  public int firstBadVersion(int n) {
    int left = 1;
    int right = n;

    while (left < right) {
      int mid = left + (right - left) / 2;
      if (isBadVersion(mid)) {
        right = mid;
      } else {
        left = 1 + mid;
      }
    }
    return left;
  }

  private boolean isBadVersion(int mid) {
    int firstBadVersion = 4;
    if (mid > firstBadVersion) {
      return true;
    }
    return false;
  }

  @Test
  public void TEST_CASE_1() {
    SortingSearchTypeFirstBadVersion firstBadVersion = new SortingSearchTypeFirstBadVersion();
    Assert.assertEquals(firstBadVersion.firstBadVersion(5), 5);
  }
}
