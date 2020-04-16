package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Baekjoon1874 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int N = Integer.parseInt(reader.readLine());

        Stack<Integer> stack = new Stack<>();
        boolean isPossible = true;

        for (int i = 0, j = 1; i < N; i++) {
            int index = Integer.parseInt(reader.readLine());
            if (!isPossible)
                continue;
            while (j <= index) {
                stack.push(j++);
                builder.append("+\n");
            }
            if (stack.peek() == index) {
                stack.pop();
                builder.append("-\n");
            } else {
                isPossible = false;
                builder = new StringBuilder("NO\n");
            }
        }

        System.out.println(builder);

    }
}

