package resolve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Baekjoon10845 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        Deque<Integer> q = new ArrayDeque<>();

        int N = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++) {

            String command = reader.readLine();

            // int n 입력되지 않는 현상 확인 필요
            if (command.equals("push")) {
                int n = Integer.parseInt(reader.readLine());
                System.out.println(n);
                q.push(n);
                continue;
            }

            if (command.equals("pop")) {
                q.pop();
                continue;
            }

            if (command.equals("size")) {
                builder.append(q.size()+"\n");
                continue;
            }

            if (command.equals("empty")) {
                if(q.isEmpty()){
                    builder.append("0\n");
                } else {
                    builder.append("1\n");
                }
                continue;
            }

            if (command.equals("front")){
                if(q.isEmpty()){
                    builder.append("-1\n");
                } else {
                    builder.append(q.getFirst()+"\n");
                }
                continue;
            }

            if (command.equals("back")){
                if(q.isEmpty()){
                    builder.append("-1\n");
                } else {
                    builder.append(q.getLast()+"\n");
                }
                continue;
            }

        }

        System.out.println(builder);

    }

}


