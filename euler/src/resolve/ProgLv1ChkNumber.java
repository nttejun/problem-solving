package resolve;


import java.util.regex.Pattern;

public class ProgLv1ChkNumber {
    public boolean solution(String s) {
        return s.matches(String.valueOf("^[0-9]*$"));

    }

    public static void main(String[] args){
        ProgLv1ChkNumber progLv1ChkNumber = new ProgLv1ChkNumber();
        System.out.println(progLv1ChkNumber.solution("123"));
    }
}
