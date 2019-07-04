package resolve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ProgLevel1Completion {

    public String solution1(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);

        int i;
        for( i=0; i<completion.length; i++){
            if(!participant[i].equals(completion[i])){
                return participant[i];
            }
        }
        return participant[i];
    }


    public String solution(String[] participant, String[] completion) {
        List<String> list = new ArrayList<String>();
        Collections.addAll(list, participant);
        for (int i = 0; i < participant.length; i++) {
            for (int j = 0; j < completion.length; j++) {
                if (participant[i] == completion[j]) {
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
        p.solution1(participant, completion);
    }
}
