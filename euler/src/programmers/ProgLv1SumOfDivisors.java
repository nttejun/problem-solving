package programmers;

import java.util.ArrayList;
import java.util.List;

public class ProgLv1SumOfDivisors {

    public int solution(int n){

        if(n==0) return 0;
        if(n==1) return 1;

        int answer = 0;
        List<Integer> list = new ArrayList<>();

        int max = n/2;
        for(int i=1; i<max; i++){
            if(n%i == 0){
                if(list.contains(n/i) == false){
                    list.add(n/i);
                }
                if(list.contains(i) == false){
                    list.add(i);
                }
            }
        }
        for(int temp : list)
            answer += temp;

        return answer;
    }

    public int solution1(int n){

        int answer =0;
        for(int i=1; i<=n/2; i++){
            if(n%i==0) answer+=i;
        }
        return answer+n;
    }

    public static void main(String[] args){

        ProgLv1SumOfDivisors progLv1SumOfDivisors = new ProgLv1SumOfDivisors();
        System.out.println(progLv1SumOfDivisors.solution(12));
        System.out.println(progLv1SumOfDivisors.solution1(56));

    }
}
