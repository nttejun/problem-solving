package resolve;

import java.util.ArrayList;
import java.util.List;

public class ProgLv2PrecedingSkill {
    public int solution(String skill, String[] skill_trees) {

        int answer = 0;

        for (int i = 0; i < skill.length(); i++) {

            for (int j = 0; j < skill_trees.length; j++) {

                for (int k = 0; k < skill_trees[j].length(); k++) {

                    char s_char = skill.charAt(i);

                    char s_t_length = skill_trees[j].charAt(k);

                    if (s_t_length == s_char) {

                        answer++;

                    }

                    if (i != skill.charAt(skill.length())) {
                        for (int idx = i + 1; idx < skill.length(); idx++) {
                            if(skill.charAt(idx) == s_char){
                                k = skill_trees[j].length();
                            }
                        }
                    }
                }
            }
        }

        return answer;

    }

    public static void main(String[] args) {
        ProgLv2PrecedingSkill p = new ProgLv2PrecedingSkill();
        String[] ary = {"BACDE", "CBADF", "AECB", "BDA"};
        int answer = p.solution("CBD", ary);
        System.out.println(answer);
    }
}
