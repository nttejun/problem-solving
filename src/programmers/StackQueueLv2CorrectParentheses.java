package programmers;

import org.junit.Test;

import java.util.Stack;

public class StackQueueLv2CorrectParentheses {
    boolean solution(String s) {
        boolean answer = true;
        char left = '(';
        char right = ')';

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == left) {
                stack.push(left);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        if (!stack.empty()) return false;
        return true;
    }

    @Test
    public void solution() {
        String s= "(()(";
        StackQueueLv2CorrectParentheses solution = new StackQueueLv2CorrectParentheses();
        solution.solution(s);
    }
}
