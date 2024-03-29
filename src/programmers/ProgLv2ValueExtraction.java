package programmers;

import java.util.*;

public class ProgLv2ValueExtraction {

  public String[] solution(String[] strings, int n) {

    String[] answer;

    List<String> list = new LinkedList<>();

    for (int i = 0; i < strings.length; i++) {
      list.add(strings[i].charAt(n) + strings[i]);
    }

    Collections.sort(list);
    answer = new String[list.size()];

    for (int i = 0; i < list.size(); i++) {
      answer[i] = list.get(i).substring(1, list.get(i).length());
    }

    return answer;
  }

  public static void main(String[] args) {
    ProgLv2ValueExtraction p = new ProgLv2ValueExtraction();
    String[] s = new String[]{"sun", "bed", "car"};
    System.out.println(Arrays.toString(p.solution(s, 1)));
  }
}
