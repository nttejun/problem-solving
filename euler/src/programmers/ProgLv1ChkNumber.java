package programmers;

public class ProgLv1ChkNumber {
    public boolean solution(String s) {
        if(s.length() == 4 || s.length() == 6) return s.matches("^[0-9]*$");
        return false;
    }

    public static void main(String[] args){
        ProgLv1ChkNumber progLv1ChkNumber = new ProgLv1ChkNumber();
        System.out.println(progLv1ChkNumber.solution("123das"));
    }
}
