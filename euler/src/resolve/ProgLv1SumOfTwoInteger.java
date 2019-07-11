package resolve;

public class ProgLv1SumOfTwoInteger {
    public long solution(int a, int b) {
        long answer = 0;

        if (a > 10000000 || a < -10000000) return answer;
        if (b > 10000000 || b < -10000000) return answer;

        if(a == b){
            answer = a;
            return answer;
        } else if (a > b){
            answer = a + b + (a-1);
            return answer;
        } else {
            answer = a + b + (b-1);
            return answer;
        }
    }

    public static void main(String[] args){
        ProgLv1SumOfTwoInteger p = new ProgLv1SumOfTwoInteger();
        System.out.println(p.solution(300000, 299998));
    }
}
