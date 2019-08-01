package resolve;

import java.util.ArrayList;
import java.util.List;

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

        int day = 0;

        for(int i=0; i<days.length; i++){
            day++;

            if(i == days.length-1){
                list.add(day);
                break;
            }

            if(days[i] < days[i+1]){
                list.add(day);
                day = 0;
            }
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }


        return answer;
    }

    public static void main(String[] args){
        ProgLv2DevelopTerm p = new ProgLv2DevelopTerm();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        p.solution(progresses, speeds);
    }
}
