package corp;

import org.junit.Test;

public class Kobit01 {

  public String solution(String x) {
    int a = Integer.parseInt(x, 2);
    return Integer.toBinaryString(a+1);
  }

  @Test
  public void TEST_01(){
    String x = "10011";
    solution(x);
  }
}
