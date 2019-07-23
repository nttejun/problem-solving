package resolve;

public class ProgLv2CenterExtraction {
    public String solution(String s) {
        String answer = "";
        int center = s.length()/2;
        if(s.length()%2 == 0){
            answer = String.valueOf(s.charAt(center-1));
        }
        answer += String.valueOf(s.charAt(center));

        return answer;
    }

    public String solution1(String s){
        return s.substring((s.length()-1) / 2, s.length()/2 + 1);
    }

    public static void main(String[] args){
        ProgLv2CenterExtraction p = new ProgLv2CenterExtraction();
        System.out.println(p.solution("abcde"));
        System.out.println(p.solution1("abcde"));
    }
}

