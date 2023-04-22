package programmers;

import java.util.HashMap;
import java.util.Map;
import org.junit.Assert;
import org.junit.Test;

public class HashLv1PlayerNotFinish {

  public String solution(String[] participant, String[] completion) {
    String answer = "";

    Map<String, Integer> map = new HashMap<>();

    for (int i=0; i<participant.length; i++) {
      if(map.get(participant[i]) != null) {
        map.put(participant[i], map.get(participant[i])+1);
        continue;
      }
      map.put(participant[i], 1);
    }

    for (int i=0; i<completion.length; i++) {
      map.put(completion[i], map.get(completion[i])-1);
    }

    for (int i=0; i<participant.length; i++) {
      int temp = map.get(participant[i]);
      if(temp > 0) {
        return participant[i];
      }
    }

    return answer;
  }

  @Test
  public void 테스트_성공_케이스_1(){
    HashLv1PlayerNotFinish hashLv1PlayerNotFinish = new HashLv1PlayerNotFinish();
    String[] p = new String[]{"leo", "kiki", "eden"};
    String[] c = new String[]{"eden", "kiki"};
    Assert.assertEquals(hashLv1PlayerNotFinish.solution(p, c), "leo");
  }

  @Test
  public void 테스트_성공_케이스_2(){
    HashLv1PlayerNotFinish hashLv1PlayerNotFinish = new HashLv1PlayerNotFinish();
    String[] p = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
    String[] c = new String[]{"josipa", "filipa", "marina", "nikola"};
    Assert.assertEquals(hashLv1PlayerNotFinish.solution(p, c), "vinko");
  }
  @Test
  public void 테스트_성공_케이스_3(){
    HashLv1PlayerNotFinish hashLv1PlayerNotFinish = new HashLv1PlayerNotFinish();
    String[] p = new String[]{"mislav", "stanko", "mislav", "ana"};
    String[] c = new String[]{"stanko", "ana", "mislav"};
    Assert.assertEquals(hashLv1PlayerNotFinish.solution(p, c), "mislav");
  }
}
