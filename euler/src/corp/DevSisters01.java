package corp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class DevSisters01 {

  public int solution(String[] names) {
    int answer = 0;

    List<String> lList = new ArrayList();
    List<String> rList = new ArrayList();

    HashMap lMap = new HashMap<>();
    HashMap rMap = new HashMap<>();

    for(int i = 0; i < names.length; i++){

      String firstStr =  names[i].substring(0, 1);

      if(!lMap.containsKey(firstStr)) {
        lMap.put(firstStr, 1);
        lList.add(firstStr);
        continue;
      }

      if(!rMap.containsKey(firstStr)) {
        rMap.put(firstStr, 1);
        rList.add(firstStr);
        continue;
      }

      int l = 0;
      int r = 0;

      l = (int) lMap.get(firstStr);
      r = (int) rMap.get(firstStr);

      if(l < r){
        l++;
        lMap.put(firstStr,l);
        lList.add(firstStr);
      } else {
        r++;
        rMap.put(firstStr,r);
        rList.add(firstStr);
      }
    }
    for(int i = 0; i < rList.size()-1; i++){
      for(int j = i+1; j < rList.size(); j++){
        if(rList.get(i).equals(rList.get(j))){
          answer++;
        }
      }
    }
    for(int i = 0; i < lList.size()-1; i++){
      for(int j = i+1; j < lList.size(); j++){
        if(lList.get(i).equals(lList.get(j))){
          answer++;
        }
      }
    }

    return answer;
  }

  @Test
  public void TEST_01(){
    String[] names = {"lemon", "lime", "werewolf", "wizard", "walnut"};
    Assert.assertEquals(1, solution(names));
  }
  @Test
  public void TEST_02(){
    String[] names = {"gingerbrave", "gingerbright", "gumball", "salt", "strawberry", "soda", "beet", "blackberry"};
    Assert.assertEquals(2, solution(names));
  }
  @Test
  public void TEST_03(){
    String[] names = {"soda", "soda", "soda", "soda", "soda"};
    Assert.assertEquals(4, solution(names));
  }
}
