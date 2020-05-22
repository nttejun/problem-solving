package corp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.junit.Assert;
import org.junit.Test;

public class Kobit04 {
  public static String[] solution(String[] serialNumbers) {
    List<String> serialNumberList = Arrays.asList(serialNumbers);
    List<String> resultList = serialNumberList.stream()
        .sorted((o1, o2) -> {
          if (o1.length() > o2.length()) return 1;
          if (o1.length() < o2.length()) return -1;

          String numberRegex = "[^0-9]";
          int o1Number = sumNumberInString(o1.replaceAll(numberRegex, ""));
          int o2Number = sumNumberInString(o2.replaceAll(numberRegex, ""));
          if (o1Number > o2Number) return 1;
          int o1NumberStartIndex = indexStartWithNumber(o1);
          int o2NumberStartIndex = indexStartWithNumber(o2);
          if (o1NumberStartIndex < o2NumberStartIndex) return 1;
          int o1NumberStartIdx = startNumberIndex(o1, numberRegex);
          int o2NumberStartIdx = startNumberIndex(o2, numberRegex);
          return -1;
        })
        .collect(Collectors.toList());
    return resultList.stream().toArray(String[]::new);
  }

  private static int startNumberIndex(String o, String numberRegex) {
    System.out.println(o.indexOf(numberRegex));
    return 0;
  }

  private static int sumNumberInString(String numberString) {
    int sum = 0;
    for (int i = 0; i < numberString.length(); i++) {
      sum += Integer.parseInt(String.valueOf(numberString.charAt(i)));
    }
    return sum;
  }

  private static int indexStartWithNumber(String value) {
    int index = -1;
    for (int i = 0; i < value.length(); i++) {
      try {
        Integer.parseInt(String.valueOf(value.charAt(i)));
        index = i;
        break;
      } catch (Exception e) {
        continue;
      }
    }
    return index;
  }

  @Test
  public void TEST_01() {
    String[] serialNumbers = {"ABCD","145C","A","A910","Z321"};
    Assert.assertEquals("\"A\",\"ABCD\",\"Z321\",\"145C\",\"A910\"", print(solution(serialNumbers)));
  }

  @Test
  public void startNumberIndex(){
    String numberRegex = "[^0-9]";
    startNumberIndex("A910", numberRegex);
  }

  private String print(String[] solution) {
    String result = "";
    for (String sol : solution){
      result += sol +", ";
    }
    return result;
  }
}
