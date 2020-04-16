package programmers;

public class ProgLv1CountPY {
    boolean solution(String s) {

        boolean answer = false;

        String str = s.toLowerCase();

        int pCnt = 0;
        int yCnt = 0;

        char c = 'n';

        for(int i=0; i<str.length(); i++){
            c = str.charAt(i);
            if(c == 'p'){
                pCnt++;
            } else if(c == 'y'){
                yCnt++;
            }
        }

        if(pCnt == yCnt) {
            answer = true;
            return answer;
        }

        if(pCnt == 0 && yCnt == 0){
            answer = true;
            return answer;
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println(answer);

        return answer;
    }

    boolean solution1(String s){
        s = s.toUpperCase();
        return s.chars().filter( e -> 'P' == e).count() == s.chars().filter(e -> 'Y' == e).count();
    }

    public static void main(String[] args){
        ProgLv1CountPY progLv1CountPY = new ProgLv1CountPY();
        progLv1CountPY.solution("pPooooyY");
        progLv1CountPY.solution1("pPooooyY");
    }
}
