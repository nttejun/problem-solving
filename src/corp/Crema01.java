package corp;

import org.junit.Test;

import java.util.*;

import static java.util.stream.Collectors.joining;
import static org.junit.Assert.assertEquals;

public class Crema01 {
  /*
   * Complete the 'numofPrizes' function below.
   *
   * The function is expected to return an INTEGER.
   * The function accepts following parameters:
   *  1. INTEGER k
   *  2. INTEGER_ARRAY marks
   */

  public static int numofPrizes(int k, List<Integer> marks) {
    // Write your code here
    Collections.sort(marks, Comparator.reverseOrder());

    int cunrrentRank = 0;
    int addRank = 0;
    int numofPrize = 0;

    if (cunrrentRank <= k) {
      cunrrentRank++;
      numofPrize++;
    }

    for (int i = 1; i < marks.size(); i++) {
      if (marks.get(i) == 0) {
        return numofPrize;
      }
      if (marks.get(i) == marks.get(i - 1)) {
        numofPrize++;
        addRank++;
        continue;
      }

      addRank++;
      cunrrentRank += addRank;
      addRank = 0;

      if (k < cunrrentRank) {
        return numofPrize;
      }
      numofPrize++;


    }
    return numofPrize;

  }


  @Test
  public void testReverseOrder() {
    List<Integer> marks = Arrays.asList(20, 40, 60, 80, 100);
    List<Integer> expected = Arrays.asList(100, 80, 60, 40, 20);
    Collections.sort(marks, Comparator.reverseOrder());
    assertEquals(expected, marks);
  }

  @Test
  public void testSampleCase1() {
    int k = 4;
    List<Integer> marks = Arrays.asList(20, 40, 60, 80, 100);
    assertEquals(4, numofPrizes(k, marks));
  }

  @Test
  public void testSampleCase2() {
    int k = 4;
    List<Integer> marks = Arrays.asList(2, 2, 3, 4, 5);
    assertEquals(5, numofPrizes(k, marks));
  }

}
