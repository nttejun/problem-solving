package resolve;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgLevel1Completion {


    public String solution(String[] participant, String[] completion) {
        List<String> list = new ArrayList<String>();
        Collections.addAll(list, participant);
        for (int i = 0; i < participant.length; i++) {
            for (int j = 0; j < completion.length; j++) {
                if (participant[i] == completion[j]) {
                    System.out.println(">>>>" + participant[i]);
                    list.remove(participant[i]);
                }
            }
        }
        System.out.println(list);
        return list.toString();
    }

    public static void main(String[] args) {
        String[] participant = {"t", "tt", "ttt"};
        String[] completion = {"t", "tt"};
        ProgLevel1Completion p = new ProgLevel1Completion();
        p.solution(participant, completion);
    }
}
