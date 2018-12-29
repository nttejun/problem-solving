package resolve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Baekjoon10845 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();
        Deque<Integer> q = new ArrayDeque<>();

        int N = Integer.parseInt(reader.readLine());

        for (int i = 0; i < N; i++) {

            String command = reader.readLine();
            String[] commandVal = command.split(" ");

            // int n 입력되지 않는 현상 확인 필요
            if (commandVal[0].equals("push")) {
                q.add(Integer.valueOf(commandVal[1]));
                continue;
            }

            if (commandVal[0].equals("pop")) {
                if(q.isEmpty()){
                    builder.append("-1\n");
                } else {
                    builder.append(q.getFirst()+"\n");
                    q.pop();
                }
                continue;
            }

            if (commandVal[0].equals("size")) {
                builder.append(q.size()+"\n");
                continue;
            }

            if (commandVal[0].equals("empty")) {
                if(q.isEmpty()){
                    builder.append("1\n");
                } else {
                    builder.append("0\n");
                }
                continue;
            }

            if (commandVal[0].equals("front")){
                if(q.isEmpty()){
                    builder.append("-1\n");
                } else {
                    builder.append(q.getFirst()+"\n");
                }
                continue;
            }

            if (commandVal[0].equals("back")){
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


