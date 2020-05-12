package programmers;

import org.junit.Assert;
import org.junit.Test;

public class SkillTstLv1RectangleStar {

  private boolean drawStar(String s) {
    int cntP = 0;
    int cntY = 0;

    for(int i = 0; i < s.length(); i++){
      if(s.charAt(i) == 'y' || s.charAt(i) == 'Y'){
        cntY++;
        continue;
      }

      if(s.charAt(i) == 'p' || s.charAt(i) == 'P'){
        cntP++;
        continue;
      }
    }
    if(cntP != cntY){
      return false;
    }

    return true;
  }

  @Test
  public void 첫번째_테스트_케이스(){
    Assert.assertTrue(drawStar("pPoooyY"));
    Assert.assertFalse(drawStar("Pyy"));
  }
}
