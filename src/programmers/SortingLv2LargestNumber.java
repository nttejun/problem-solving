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

  @Test
  public void TEST_성공케이스_2() {
    int[] numbers = new int[]{3, 30, 34, 5, 9};
    Assert.assertEquals("9534330", solution(numbers));
  }

  @Test
  public void TEST_COMPARE_TO() {
    String[] nums = new String[]{"1", "10", "2", "29", "20", "31", "34"};

    Arrays.sort(nums, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return (o2+o1).compareTo(o1+o2);
      }
    });

    String resultAsc = "";
    for (String n : nums) resultAsc += n + " ";
    Assert.assertEquals("34 31 29 2 20 1 10 ", resultAsc);

    Arrays.sort(nums, new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        return (o1+o2).compareTo(o2+o1);
      }
    });

    String resultDesc = "";
    for (String n : nums) resultDesc += n + " ";
    Assert.assertEquals("10 1 20 2 29 31 34 ", resultDesc);
  }
}
