package resolve;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baekjoon2501 {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int P = scan.nextInt();

        if(N < 1 || N > 10000) return;
        if(P < 1 || P > N) return;

        List<Integer> list = new ArrayList<>();

        StringBuilder builder = new StringBuilder();

        if(P > N) return;

        for(int i=1; i<=N; i++){
            if(N%i == 0){
                list.add(i);
            }
        }

        if(list.size() < P){
            builder.append("0");
        } else {
            builder.append(list.get(P-1));
        }

        System.out.println(builder.toString());

    }
}
