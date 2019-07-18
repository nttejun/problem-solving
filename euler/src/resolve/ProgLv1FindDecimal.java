package resolve;

public class ProgLv1FindDecimal {
    public int solution(int n) {
        int answer = 0;
        boolean flag = true;

        for(int i=2; i<=n; i++){
            flag = true;

            for(int j=2; j<i-1; j++){
                if(i%j == 0){
                    flag = false;
                    break;
                }
            }

            if(flag == true) answer++;

        }

        return answer;
    }
    public static void main(String[] args){
        ProgLv1FindDecimal findDecimal = new ProgLv1FindDecimal();
        findDecimal.solution(10);
    }
}
