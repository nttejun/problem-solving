package resolve;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ProgLv2Laser {
    public int solution(String arrangement) {

        Queue<String> q = new ConcurrentLinkedDeque<>();

        for (int i = 0; i < arrangement.length(); i++) {
            q.add(String.valueOf(arrangement.charAt(i)));
        }

        int answer = 0;
        int balance = 0;

        String qNow = q.poll();
        String qNext = q.poll();

        for (int i = 0; i < arrangement.length(); i++) {


            if (qNow == "(") {
                balance++;

                if (qNext == "(") {
                    balance++;
                    answer++;

                } else if (qNext == ")"){
                    balance--;

                    if(balance > 0){
                        answer++;
                    }

                }

            } else if (qNow == ")") {
                 balance--;

                if (qNext == "(") {

                } else if (qNext == ")") {

                }
            }

            qNow = qNext;
            qNext = q.poll();

        }

        return answer;
    }
}
