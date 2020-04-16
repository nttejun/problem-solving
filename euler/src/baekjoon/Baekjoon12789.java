package baekjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Baekjoon12789 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();

        List<Integer> list = new ArrayList<>();
        Stack stack = new Stack();

        int count = 0;

        for (int i = 0; i < N; i++) {
            int temp = scan.nextInt();
            list.add(temp);
        }

        int countLength = list.size();

        for(int i = 0; i < countLength; i++){
            if(list.get(i) == count +1){
                count++;
            } else {
                stack.push(list.get(i));
            }
        }

        int stackSize = stack.size();
        for (int i = 0; i < stackSize; i++) {
            int temp = (int) stack.peek();
            if (temp == count + 1) {
                stack.pop();
                count++;
            }
        }

        if(count == N) System.out.println("Nice");
        else System.out.println("Sad");
    }
}
