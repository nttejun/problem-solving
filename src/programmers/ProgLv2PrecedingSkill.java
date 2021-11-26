package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ProgLv2PrecedingSkill {

  public int solution(String skill, String[] skill_trees) {

    int answer = 0;

    boolean flag = true;

    for (int j = 0; j < skill_trees.length; j++) {

      for (int i = 0; i < skill.length(); i++) {

        for (int k = 0; k < skill_trees[j].length(); k++) {

          if (skill_trees[j].charAt(k) == skill.charAt(i)) {

            break;

          }

          if (i + 1 < skill.length()) {

            if (skill_trees[j].charAt(k) == skill.charAt(i + 1)) {

              flag = false;
              break;

            }

          }

        }

        if (flag == false) {
          break;
        }

      }

      if (flag == true) {
        answer++;
      } else {
        flag = true;
      }

    }

    System.out.println(System.nanoTime());
    return answer;

  }

  public int solution2(String skill, String[] skill_trees) {
    int answer = 0;
    ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
    Iterator<String> it = skillTrees.iterator();

    while (it.hasNext()) {
      if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
        it.remove();
      }
    }
    answer = skillTrees.size();

    System.out.println(System.nanoTime());
    return answer;

  }

  public static void main(String[] args) {
    ProgLv2PrecedingSkill p = new ProgLv2PrecedingSkill();
//        String[] ary = {"BACDE", "CBADF", "AECB", "BDA"};
//        int answer = p.solution("CBD", ary);
//        int answer2 = p.solution2("CBD", ary);
    String[] ary = {"BACDE", "CBADF", "AECB", "BDA", "BACDE", "CBADF", "AECB", "BDA", "BACDE",
        "CBADF", "AECB", "BDA", "BACDE", "CBADF", "AECB", "BDA", "BACDE", "CBADF", "AECB", "BDA",
        "BACDE", "CBADF", "AECB", "BDA", "BACDE", "CBADF", "AECB", "BDA", "BACDE", "CBADF", "AECB",
        "BDA", "BACDE", "CBADF", "AECB", "BDA", "BACDE", "CBADF", "AECB", "BDA", "BACDE", "CBADF",
        "AECB", "BDA", "BACDE", "CBADF", "AECB", "BDA", "BACDE", "CBADF", "AECB", "BDA"};
    int answer = p.solution(
        "CBDZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQW",
        ary);
    int answer2 = p.solution2(
        "CBDZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQWZXPUQW",
        ary);
    System.out.println(answer);
    System.out.println(answer2);
  }
}
