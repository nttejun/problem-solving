package programmers;

import java.util.Arrays;
import java.util.Comparator;
import org.junit.Assert;
import org.junit.Test;

public class SortingLv2LargestNumber {

  public String solution(int[] numbers) {

    String answer = "";
    boolean except = true;
    String[] num = new String[numbers.length];

    for(int i = 0; i < num.length; i++){
      num[i] = String.valueOf(numbers[i]);
      if(numbers[i] != 0) except = false;
    }

    Arrays.sort(num, new Comparator<String>(){
      @Override
      public int compare(String n1, String n2) {
        return (n2+n1).compareTo(n1+n2);
      }
    });
    for(int i = 0; i < num.length; i++)
      answer += num[i];
    if(except) answer = "0";
    return answer;
  }

  @Test
  public void TEST_성공케이스() {
    int[] numbers = new int[]{6, 10, 2};
    Assert.assertEquals("6210", solution(numbers));
  }
}
