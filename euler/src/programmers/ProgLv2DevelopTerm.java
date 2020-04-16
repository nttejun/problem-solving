package programmers;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ProgLv2DevelopTerm {
    public int[] solution(int[] progresses, int[] speeds) {

        int[] remainProg = new int[progresses.length];
        for (int i = 0; i < progresses.length; i++) {
            remainProg[i] = 100 - progresses[i];
        }

        int prog = 0;
        int[] days = new int[progresses.length];

        for(int i=0; i<progresses.length; i++){

            prog = speeds[i];

            for(int j=0; j<=100000000; j++){
                if(remainProg[i] <= prog) {
                    days[i] = j+1;
                    break;
                }
                prog = prog + speeds[i];
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

        List<Integer> result = new ArrayList<>();
        int standard = q.poll();
        int cnt = 1;

        while (!q.isEmpty()){
            int num = q.poll();
            if(standard >= num){
                cnt++;
            } else {
                result.add(cnt);
                cnt = 1;
                standard = num;
            }
        }

        result.add(cnt);
        int[] answer = new int[result.size()];

        for(int i=0; i<answer.length; i++){
            answer[i] = result.get(i);
        }
        return answer;
    }

    public int[] solution2(int[] progresses, int[] speeds) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> answerList = new ArrayList<>();

        for(int i = 0; i < speeds.length; i++){
            double remain = (100-progresses[i] / (double) speeds[i]);
            int date = (int) Math.ceil(remain);

            if(!q.isEmpty() && q.peek() < date){
                answerList.add(q.size());
                q.clear();
            }

            q.offer(date);
        }

        answerList.add(q.size());

        int[] answer = new int[answerList.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = answerList.get(i);
        }
        return answer;
    }

    public int[] solution3(int[] progresses, int[] speeds) {
        int[] dayOfend = new int[100];
        int day = -1;
        for(int i=0; i<progresses.length; i++){
            while (progresses[i] + (day*speeds[i]) < 100){
                day++;
            }
            dayOfend[day]++;
        }
        return Arrays.stream(dayOfend).filter(i -> i!=0).toArray();
    }

        public static void main(String[] args){
        ProgLv2DevelopTerm p = new ProgLv2DevelopTerm();
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        p.solution1(progresses, speeds);
    }
}
