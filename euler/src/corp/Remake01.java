package corp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class Remake01 {

  public String findWordMatchQueryList(String query, String[] dict){
    Arrays.sort(dict);

    List<String> list = new ArrayList<>();

    for(int i = 0; i < dict.length; i++){
      String tempQuery = query;
      String match = "";

      for(int j = i; j < dict.length; j++){
        while (tempQuery.contains(dict[j])){
          match += dict[j] + " ";
          tempQuery = tempQuery.replaceFirst(dict[j], "");
        }
      }

      if(tempQuery.length() == 0) {
        match = match.substring(0, match.length() - 1);
        list.add(match);
      }
    }

    return list.toString();
  }

  @Test
  public void 첫번째_테스트_케이스(){
    String query = "donaldtrump";
    String[] dict = {"donald", "trump"};
    String expected = "[donald trump]";
    Assert.assertEquals(expected, findWordMatchQueryList(query, dict));
  }

  @Test
  public void 두번째_테스트_케이스(){
    String query = "abcd";
    String[] dict = {"a", "b", "ab", "cd"};
    String expected = "[a b cd, ab cd]";
    Assert.assertEquals(expected, findWordMatchQueryList(query, dict));
  }

  @Test
  public void 세번째_테스트_케이스(){
    String query = "aaa";
    String[] dict = {"a"};
    String expected = "[a a a]";
    Assert.assertEquals(expected, findWordMatchQueryList(query, dict));
  }

  @Test
  public void 네번째_테스트_케이스(){
    String query = "abcde";
    String[] dict = {"a", "b", "c", "ab", "cd", "de", "abc"};
    String expected = "[a b c de, ab c de, abc de]";
    Assert.assertEquals(expected, findWordMatchQueryList(query, dict));
  }

}
