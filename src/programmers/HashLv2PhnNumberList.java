package programmers;

import java.util.Arrays;
import org.junit.Test;

public class HashLv2PhnNumberList {

  // O(n^2)
  public boolean solution(String[] phone_book) {
    for (int i = 0; i < phone_book.length; i++) {
      for (int j = 0; j < phone_book.length; j++) {
        if (i == j) { continue;}
        if(phone_book[i].startsWith(phone_book[j])) {
          return false;
        }
      }
    }
    return true;
  }

  // O(nlogn)
  public boolean solutionSortingVersion(String[] phone_book) {
    Arrays.sort(phone_book);
    for(int i = 0; i < phone_book.length-1; i++) {
      if(phone_book[i+1].startsWith(phone_book[i])) {
        return false;
      }
    }
    return true;
  }

  @Test
  public void TEST() {
    solution(new String[]{"119", "97674223", "1195524421"});
    solution(new String[]{"123", "456", "789"});
  }
}
