package resolve;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ProgLv2DevelopTerm {
    public int[] solution(int[] progresses, int[] speeds) {

        int[] remainProg = new int[progresses.length];
        int[] days = new int[progresses.length];

        for (int i = 0; i < progresses.length; i++) {

            remainProg[i] = 100 - progresses[i];

        }

        int rProg = 0;

        for(int i=0; i<progresses.length; i++){

            rProg = speeds[i];

            for(int j=0; j<=101; j++){
                if(remainProg[i] <= rProg) {
                    days[i] = j+1;
                    break;
                }
                rProg = rProg + speeds[i];
            }
        }

        List<Integer> list = new ArrayList<>();

        int func = 0;

        for(int i=0; i<days.length; i++){
            func++;

            if(i == days.length-1){
                list.add(func);
                break;
            }

            if(days[i] < days[i+1]){
                list.add(func);
                func = 0;
            }
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }


        return answer;
    }

    public int[] solution1(int[] progresses, int[] speeds) {
        Queue<Integer> q = new ConcurrentLinkedDeque<>();
        for(int i=0; i<progresses.length; i++){
            q.add((100-progresses[i]) % speeds[i] == 0
                    ? (100-progresses[i]) / speeds[i]
                    : (100-progresses[i]) / speeds[i] + 1
            );
        }

        int[] answer = {};
        return answer;
    }

        public static void main(String[] args){
        ProgLv2DevelopTerm p = new ProgLv2DevelopTerm();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        p.solution1(progresses, speeds);
    }
}
