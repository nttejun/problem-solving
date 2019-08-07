package resolve;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class ProgLv2Laser {
    public int solution(String arrangement) {
        int answer = 0;

        Queue<String> q = new ConcurrentLinkedDeque<>();

        for (int i = 0; i < arrangement.length(); i++) {
            q.add(String.valueOf(arrangement.charAt(i)));
        }

        String qNow = q.poll();
        String qNext = q.poll();

        for (int i = 0; i < arrangement.length(); i++) {


            if (qNow == "(") {

                if (qNext == "(") {

                } else if (qNext == ")"){

                }

            } else if (qNow == ")") {

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
