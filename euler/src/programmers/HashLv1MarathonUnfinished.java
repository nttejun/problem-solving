package programmers;

import java.util.Arrays;
import java.util.HashMap;
import org.junit.Assert;
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

  public String solutionUsingHash(String[] participant, String[] completion) {
    HashMap<String, Integer> pMap = new HashMap<>();
    for(String s : participant) pMap.put(s, pMap.getOrDefault(s, 0) - 1);
    for(String s : completion) pMap.put(s, pMap.get(s) + 1);
    for(String key : pMap.keySet()){
      if(pMap.get(key) != 0){
        return key;
      }
    }
    return "";
  }

  @Test
  public void TEST() {
    String[] p = {"leo", "kiki", "eden"};
    String[] c = {"eden", "kiki"};
    Assert.assertEquals("leo", solution(p, c));
  }

  @Test
  public void TEST_HASH() {
    String[] p = {"leo", "kiki", "eden"};
    String[] c = {"eden", "kiki"};
    Assert.assertEquals("leo", solutionUsingHash(p, c));
  }

  @Test
  public void TEST_HASH_03() {
    String[] p = {"mislav", "stanko", "mislav", "ana"};
    String[] c = {"stanko", "ana", "mislav"};
    Assert.assertEquals("mislav", solutionUsingHash(p, c));
  }
}


