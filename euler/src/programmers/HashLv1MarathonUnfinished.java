package programmers;

import java.util.Arrays;
import org.junit.Test;

public class HashLv1MarathonUnfinished {

  public String solution(String[] participant, String[] completion) {
    Arrays.sort(participant);
    Arrays.sort(completion);
    for (int i = 0; i < completion.length; i++) {
      if (!participant[i].equals(completion[i])) {
        return participant[i];
      }
    }
    return participant[participant.length - 1];
  }

  @Test
  public void test() {
    String[] p = {"leo", "kiki", "eden"};
    String[] c = {"eden", "kiki"};
    solution(p, c);
  }
}


