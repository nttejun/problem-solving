package resolve;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Baekjoon1874 {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int N = Integer.parseInt(reader.readLine());
        Stack<Integer> stack = new Stack<>();
        boolean isPossible = true;

        for(int i=0, j=1; i<N; i++){
            int input = Integer.parseInt(reader.readLine());
            if(!isPossible)
                continue;
            while(j<=input){
                stack.push(j++);
                builder.append("+\n");
            }
            if(stack.peek() == input){
                stack.pop();
                builder.append("=\n");
            }
            else {
                builder = new StringBuilder("NO\n");
                isPossible = false;
            }
        }

        System.out.println(builder);

    }
}
