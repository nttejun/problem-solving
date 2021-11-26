package programmers;

import org.junit.Assert;
import org.junit.Test;

public class HashLv2isPrefixPhonebook {

  public boolean solution(String[] phone_book) {
    for (int i = 0; i < phone_book.length; i++) {
      for (int j = 0; j < phone_book.length; j++) {
        if (i == j) {
          continue;
        }
        if (phone_book[i].startsWith(phone_book[j])) {
          return false;
        }
      }
    }
    return true;
  }

  @Test
  public void TEST_01() {
    Assert.assertFalse(solution(new String[]{"119", "97674223", "1195524421"}));
  }

  @Test
  public void TEST_02() {
    Assert.assertTrue(solution(new String[]{"123", "456", "789"}));
  }

  @Test
  public void TEST_03() {
    Assert.assertFalse(solution(new String[]{"12", "123", "1235", "567", "88"}));
  }
}
